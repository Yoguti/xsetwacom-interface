-- Function to detect the Linux distribution
function print_os()
    local distro = detect_os()    
    print("Detected distribution: " .. distro)
end

function detect_os()
    local handle = io.popen("lsb_release -i -s 2>/dev/null")
    local distro = handle:read("*a"):lower():gsub("\n", ""):gsub(" ", "")
    handle:close()
    if distro == "" then
        -- Fallback detection
        print("lsb_release not found. Attempting fallback detection.")
        local file = io.open("/etc/os-release", "r")
        if file then
            for line in file:lines() do
                if line:match("^ID=") then
                    distro = line:match("=(.*)"):lower()
                    break
                end
            end
            file:close()
        else
            print("Cannot determine distribution.")
            return "unknown"
        end
    end
    return distro
end


-- Function to install a package using the appropriate package manager
function install_package(package_cmd)
    local result = os.execute(package_cmd)
    if result ~= 0 then
        print("Failed to install package.")
        return false
    end
    return true
end

-- Function to install xsetwacom and lgi based on distribution
function install_xsetwacom_and_lgi()
    local distro = detect_os()
    local xsetwacom_installed = command_exists("xsetwacom")
    local lgi_installed = pcall(require, "lgi")

    if xsetwacom_installed then
        print("xsetwacom is already installed.")
    else
        print("xsetwacom is not installed. Installing...")
        local install_cmd
        if (distro == "ubuntu") or (distro == "debian") then
            install_cmd = 'sudo apt-get update && sudo apt-get install -y xserver-xorg-input-wacom'
        elseif (distro == "fedora") or (distro == "redhat") or (distro == "mageia") then
            install_cmd = 'sudo dnf install -y xorg-x11-drv-wacom'
        elseif (distro == "arch") or (distro == "manjaro") or (distro == "endeavouros") then
            install_cmd = 'sudo pacman -Syu --noconfirm xf86-input-wacom'
        elseif distro == "suse" then
            install_cmd = 'sudo zypper install -y xf86-input-wacom'
        elseif distro == "gentoo" then
            install_cmd = 'sudo emerge xf86-input-wacom'
        elseif distro == "adelie" then
            install_cmd = 'sudo apk add xf86-input-wacom'
        else
            print("Unsupported distribution for xsetwacom installation: " .. distro)
            return false
        end
        if not install_package(install_cmd) then
            return false
        end
        print("xsetwacom installation completed successfully.")
    end

    if lgi_installed then
        print("lua-lgi is already installed.")
    else
        print("lua-lgi is not installed. Installing...")
        local lgi_install_cmd
        if (distro == "ubuntu") or (distro == "debian") then
            lgi_install_cmd = 'sudo apt-get install -y lua-lgi libgirepository1.0-dev'
        elseif (distro == "fedora") or (distro == "redhat") or (distro == "mageia") then
            lgi_install_cmd = 'sudo dnf install -y lua-lgi'
        elseif (distro == "arch") or (distro == "manjaro") or (distro == "endeavouros") then
            lgi_install_cmd = 'sudo pacman -S --noconfirm lua-lgi'
        elseif distro == "suse" then
            lgi_install_cmd = 'sudo zypper install -y lua-lgi'
        elseif distro == "gentoo" then
            lgi_install_cmd = 'sudo emerge dev-lua/lgi'
        elseif distro == "adelie" then
            lgi_install_cmd = 'sudo apk add lua-lgi'
        else
            print("Unsupported distribution for lua-lgi installation: " .. distro)
            return false
        end
        if not install_package(lgi_install_cmd) then
            print("Attempting to install lgi via LuaRocks...")
            local luarocks_install_cmd = 'sudo luarocks install lgi'
            if not install_package(luarocks_install_cmd) then
                return false
            end
        end
        print("lua-lgi installation completed successfully.")
    end

    return true
end

-- Function to ensure the latest Lua version (5.4) is installed
function ensure_lua_version()
    local handle = io.popen("lua5.4 -v 2>/dev/null")
    local lua_version = handle:read("*a"):match("Lua (%d+.%d+)")
    handle:close()
    local latest_version = "5.4"

    if lua_version ~= latest_version then
        print("Lua " .. latest_version .. " is not installed. Installing...")
        local install_cmd
        if (distro == "ubuntu") or (distro == "debian") then
            install_cmd = 'sudo apt-get install -y lua' .. latest_version
        elseif (distro == "fedora") or (distro == "redhat") or (distro == "mageia") then
            install_cmd = 'sudo dnf install -y lua' .. latest_version
        elseif (distro == "arch") or (distro == "manjaro") or (distro == "endeavouros") then
            install_cmd = 'sudo pacman -S --noconfirm lua' .. latest_version
        elseif distro == "suse" then
            install_cmd = 'sudo zypper install -y lua' .. latest_version
        elseif distro == "gentoo" then
            install_cmd = 'sudo emerge lua' .. latest_version
        elseif distro == "adelie" then
            install_cmd = 'sudo apk add lua' .. latest_version
        else
            print("Unsupported distribution for Lua " .. latest_version .. " installation: " .. distro)
            return false
        end
        if not install_package(install_cmd) then
            return false
        end
        print("Lua " .. latest_version .. " installation completed successfully.")
    end
    return true
end

-- Function to check if Java 21 is installed
function check_java_installed()
    local handle = io.popen("java -version 2>&1")
    local java_version_output = handle:read("*a")
    handle:close()
    return java_version_output:find("openjdk 21") ~= nil
end

-- Function to install Java 21
function install_java_21()
    local distro = detect_os()

    -- Check if Java 21 is already installed
    local java_installed = false
    if (distro == "arch") or (distro == "manjaro") or (distro == "endeavouros") then
        local handle = io.popen("pacman -Q | grep jdk21-openjdk 2>/dev/null")
        local result = handle:read("*a"):gsub("\n", "")
        handle:close()
        java_installed = result ~= ""
    elseif (distro == "ubuntu") or (distro == "debian") then
        local handle = io.popen("dpkg -l | grep openjdk-21-jdk 2>/dev/null")
        local result = handle:read("*a"):gsub("\n", "")
        handle:close()
        java_installed = result ~= ""
    elseif (distro == "fedora") or (distro == "redhat") or (distro == "mageia") then
        local handle = io.popen("dnf list installed | grep java-21-openjdk-devel 2>/dev/null")
        local result = handle:read("*a"):gsub("\n", "")
        handle:close()
        java_installed = result ~= ""
    elseif distro == "suse" then
        local handle = io.popen("zypper se --installed-only | grep java-21-openjdk 2>/dev/null")
        local result = handle:read("*a"):gsub("\n", "")
        handle:close()
        java_installed = result ~= ""
    elseif distro == "gentoo" then
        local handle = io.popen("equery list dev-java/openjdk:21 2>/dev/null")
        local result = handle:read("*a"):gsub("\n", "")
        handle:close()
        java_installed = result ~= ""
    elseif distro == "adelie" then
        local handle = io.popen("apk info | grep openjdk21 2>/dev/null")
        local result = handle:read("*a"):gsub("\n", "")
        handle:close()
        java_installed = result ~= ""
    else
        print("Unsupported distribution for Java installation check: " .. distro)
        return false
    end

    if java_installed then
        print("Java 21 is already installed.")
        return true
    end

    print("Java 21 is not installed. Installing...")
    local java_install_cmd
    if (distro == "ubuntu") or (distro == "debian") then
        java_install_cmd = 'sudo apt-get update && sudo apt-get install -y openjdk-21-jdk'
    elseif (distro == "fedora") or (distro == "redhat") or (distro == "mageia") then
        java_install_cmd = 'sudo dnf install -y java-21-openjdk-devel'
    elseif (distro == "arch") or (distro == "manjaro") or (distro == "endeavouros") then
        java_install_cmd = 'sudo pacman -Syu --noconfirm jdk21-openjdk'
    elseif distro == "suse" then
        java_install_cmd = 'sudo zypper install -y java-21-openjdk'
    elseif distro == "gentoo" then
        java_install_cmd = 'sudo emerge dev-java/openjdk:21'
    elseif distro == "adelie" then
        java_install_cmd = 'sudo apk add openjdk21'
    else
        print("Unsupported distribution for Java 21 installation: " .. distro)
        return false
    end
    if not install_package(java_install_cmd) then
        return false
    end
    print("Java 21 installation completed successfully.")
    return true
end

-- Cleanup task list
local cleanup_tasks = {}

-- Function to add a cleanup task
function add_cleanup_task(task)
    table.insert(cleanup_tasks, task)
end

-- Function to perform cleanup
function perform_cleanup()
    print("Performing cleanup...")
    for i = #cleanup_tasks, 1, -1 do
        local success, error_msg = pcall(cleanup_tasks[i])
        if not success then
            print("Cleanup task failed: " .. error_msg)
        end
    end
    print("Cleanup completed.")
end


-- Function to check if a directory exists
function dir_exists(directory)
    local f = io.popen("cd " .. directory .. " 2> /dev/null && echo 'exists'")
    local result = f:read("*l")
    f:close()
    return result == "exists"
end

-- Function to check and install dependencies
function check_and_install_dependencies()
    local dependencies = {"git", "curl", "wget"}
    local distro = detect_os()

    for _, dep in ipairs(dependencies) do
        print("Checking if " .. dep .. " is installed...")
        local dep_installed = command_exists(dep)

        if dep_installed then
            print(dep .. " is already installed.")
        else
            print(dep .. " is not installed. Installing...")
            local dep_install_cmd
            if (distro == "ubuntu") or (distro == "debian") then
                dep_install_cmd = 'sudo apt-get update && sudo apt-get install -y ' .. dep
            elseif (distro == "fedora") or (distro == "redhat") or (distro == "mageia") then
                dep_install_cmd = 'sudo dnf install -y ' .. dep
            elseif (distro == "arch") or (distro == "manjaro") or (distro == "endeavouros") then
                dep_install_cmd = 'sudo pacman -Syu --noconfirm ' .. dep
            elseif distro == "suse" then
                dep_install_cmd = 'sudo zypper install -y ' .. dep
            elseif distro == "gentoo" then
                dep_install_cmd = 'sudo emerge ' .. dep
            elseif distro == "adelie" then
                dep_install_cmd = 'sudo apk add ' .. dep
            else
                print("Unsupported distribution for dependency installation: " .. distro)
                return false
            end
            if not install_package(dep_install_cmd) then
                return false
            end
            print(dep .. " installation completed successfully.")
        end
    end

    print("All dependencies are installed.")
    return true
end


-- Function to check if a command exists
function command_exists(cmd)
    local handle = io.popen("which " .. cmd .. " 2>/dev/null")
    local result = handle:read("*a"):gsub("\n", "")
    handle:close()
    return result ~= ""
end

-- Function to clone the GitHub repository
function clone_repository()
    if dir_exists("xsetwacom-interface") then
        print("The repository 'xsetwacom-interface' already exists. Skipping clone.")
        return io.popen("pwd"):read("*l") .. "/xsetwacom-interface"
    end

    print("Cloning the GitHub repository...")
    local clone_cmd = "git clone https://github.com/Yoguti/xsetwacom-interface 2>&1"
    local handle = io.popen(clone_cmd)
    
    if not handle then
        print("Failed to run the clone command.")
        return nil
    end
    
    local result = handle:read("*a")
    local success, _, exit_code = handle:close()
    
    print(result)

    if success and dir_exists("xsetwacom-interface") then
        -- Use the current working directory
        local absolute_path = io.popen("pwd"):read("*l") .. "/xsetwacom-interface"
        print("xsetwacom-interface absolute path: " .. absolute_path)
        return absolute_path
    else
        print("Failed to clone the repository. Exit code: " .. tostring(exit_code))
        return nil
    end
end

-- Function to create the "wacomui" command
function createCommand(repo_path)
    print("Creating 'wacomui' command...")

    -- Attempt to get the top-level path
    local top_level_path = io.popen("git -C " .. repo_path .. " rev-parse --show-toplevel"):read("*l")

    if not top_level_path or top_level_path == "" then
        print("Failed to get the top-level repository path.")
        return false
    end

    print("Top-level path: " .. top_level_path)  -- Debugging output

    -- Check if 'wacomui' command already exists
    local command_path = "/usr/local/bin/wacomui"
    local command_exists = io.popen("command -v wacomui"):read("*l")

    if command_exists and command_exists ~= "" then
        print("'wacomui' command already exists. No need to create it again.")
        return true  -- Command already exists, no need to create
    end

    -- Create the command script
    local command_script = [[
#!/bin/bash
cd ]] .. top_level_path .. [[ && java -jar xsetWacomRE-last.jar
]]

    -- Write the command script to a file
    local file = io.open("/tmp/wacomui", "w")
    if file then
        file:write(command_script)
        file:close()
        
        -- Make the script executable and move it to /usr/local/bin
        local result = os.execute("chmod +x /tmp/wacomui && sudo mv /tmp/wacomui " .. command_path)

        -- Check if the command was successful
        if result == true then
            print("'wacomui' command created successfully.")
            return true
        elseif result == false then
            print("Failed to create 'wacomui' command due to execution error.")
            return false
        else
            print("Failed to create 'wacomui' command. Exit code: " .. tostring(result))
            return false
        end
    else
        print("Failed to create temporary command file.")
        return false
    end
end

-- Main execution block
print("Starting installation script...")

if not check_and_install_dependencies() then
    print("Failed to install required dependencies.")
    os.exit(1)
end

-- Ensure install_java_21 is defined and working
if not install_java_21() then
    print("Java 21 installation failed.")
    os.exit(1)
end

-- Call clone_repository only once
local repo_path = clone_repository()
if not repo_path then
    print("Failed to clone the repository.")
    os.exit(1)
end

-- Create the 'wacomui' command
if not createCommand(repo_path) then
    print("Failed to create 'wacomui' command.")
    perform_cleanup()
    os.exit(1)
end

print("Setup completed successfully.")
perform_cleanup()
print("You can now use the 'wacomui' command to launch the xsetwacom interface.")
