package com.yoguti.xsetwacomre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.jse.JsePlatform;

public class LuaBridge {
    static Globals globals = JsePlatform.standardGlobals();
    static LuaValue luaFunctions;
    static LuaValue global_var = JsePlatform.standardGlobals();
    static LuaValue getDevices;
    static LuaValue getValidOptions;
    static {
        try {
            // Load the Lua file as a resource
            InputStream inputStream = LuaBridge.class.getResourceAsStream("/wacom-backend.lua");
            if (inputStream == null) {
                throw new RuntimeException("Could not find wacom-backend.lua");
            }

            // Load and execute the Lua script
            luaFunctions = globals.load(new InputStreamReader(inputStream), "wacom-backend.lua").call();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<String> lua_GetDevices() {
        getDevices = luaFunctions.get("getDevices");
        LuaValue retvals = getDevices.call();

        List<String> deviceList = new ArrayList<>();

        if (retvals.istable()) {
            LuaTable devicesTable = (LuaTable) retvals;
            for (int i = 1; i <= devicesTable.length(); i++) {
                deviceList.add(devicesTable.get(i).tojstring());
            }
        } else {
           deviceList.clear();
           deviceList.add("not a table");
        }
        if(deviceList.isEmpty()){
           deviceList.clear();
           deviceList.add("no devices connected");
        }

        return deviceList;
    }
    
public static List<String> lua_getValidOptions(String device) {
    // Get the Lua function "getValidOptions"
    LuaValue getValidOptions = luaFunctions.get("getValidOptions");
    
    // Call the function with the device name as argument
    LuaValue retvals = getValidOptions.call(LuaValue.valueOf(device));

    List<String> validOptionsList = new ArrayList<>();

    // Check if the return value is a Lua table
    if (retvals.istable()) {
        LuaTable optionsTable = (LuaTable) retvals;
        for (int i = 1; i <= optionsTable.length(); i++) {
            validOptionsList.add(optionsTable.get(i).tojstring());
        }
    } else {
        validOptionsList.clear();
        validOptionsList.add("not a table");
    }

    // Check if the validOptionsList is empty
    if (validOptionsList.isEmpty()) {
        validOptionsList.clear();
        validOptionsList.add("no valid options found");
    }

    return validOptionsList;
}

 public static void CallBash(String device, String parameter, String value) {
        // Construct the command string
        String command = String.format("xsetwacom set '%s' %s %s", device, parameter, value);

        // Use ProcessBuilder to execute the command
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("bash", "-c", command); // Use bash to execute the command

        try {
            // Start the process
            Process process = processBuilder.start();

            // Read the output from the command
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuilder output = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }

            // Wait for the process to finish and get the exit value
            int exitCode = process.waitFor();
            System.out.println("Command executed with exit code: " + exitCode);
            System.out.println("Output: " + output.toString());

        } catch (IOException e) {
            System.err.println("IOException occurred: " + e.getMessage());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupted status
            System.err.println("Command execution was interrupted: " + e.getMessage());
        }
 }
}
