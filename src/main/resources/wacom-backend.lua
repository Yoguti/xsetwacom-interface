local function executeCommand(command)
    local handle = io.popen(command)
    local result = handle:read("*a")
    handle:close()
    return result
end

local function getDevices()
    local result = executeCommand("xsetwacom --list devices")
    if result == nil then
        return {} -- or handle the error appropriately
    end
    local devices = {}
    for line in result:gmatch("[^\r\n]+") do  --line eleven
        -- Match and capture the device name, which is everything before "id:"
        local device = line:match("(.+)%sid:")
        if device then
            table.insert(devices, device:match("^%s*(.-)%s*$")) -- Trim any extra spaces
        end
    end
    return devices
end


local function getValidOptions(device)
        -- Construct the command to get all options for the specified device
        local command = "xsetwacom get \"" .. device .. "\" all"
        local output = executeCommand(command) -- Execute the command and get the output
    
        local optionsList = {}  -- Table to store valid options
    
        -- Split output into lines
        for line in output:gmatch("[^\r\n]+") do
            -- Extract options inside quotes, ignoring lines that indicate non-existent properties
            local optionName = line:match('Option "%s*(%S+)%s*"%s*')
            if optionName then
                table.insert(optionsList, optionName)  -- Store the option in the optionsList table
            end
        end
    
        return optionsList  -- Return the optionsList table
    end


    local function callBash(device, parameter, value)
        local command = string.format("xsetwacom set '%s' %s %s", device, parameter, value)
        local output, success = executeCommand(command)  -- Get output and status
    
        if success then
            return output, 1  -- Indicate success with output
        else
            return output, 0  -- Indicate failure
        end
    end
    
    -- Check if the last command was successful
    local function checkFunction(device, parameter, value)
        local previousOutput, previousStatus = callBash(device, parameter, value)
        local currentOutput, currentStatus = callBash(device, parameter, value)
    
        if previousStatus == 1 and currentStatus == 1 then
            if previousOutput == currentOutput then
                print("Either that option was already set to that value or there was an invalid value inputted.")
            end
        end
    end    

return {
    getValidOptions = getValidOptions,
    getDevices = getDevices,
    executeCommand = executeCommand,
    callBash = callBash,
    checkFunction = checkFunction,
}
