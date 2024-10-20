
## Installation

Simply download the file named as "install-script" and execute it. 

```bash
  lua install-script.lua
```

The file will download the necessary dependencies and setup the project for you. After the installation is complete, type out "wacomui" in you terminal to open the program.
    

## FAQ

#### Does it work for my distro?

It might! However, there may be cases where a dependency that the script tries to install no longer exists under that name, or I may have overlooked compatibility with your specific OS. Please check if you can install the required dependencies manually (Java 21, Lua 5.X, and xsetwacom). If you can, navigate to the master branch and download xsetWacomRE-last.jar. You can then run it with the following command:

```bash
  java -jar xsetWacomRE-last.jar
```

This will execute the program. Note that the "wacomui" shortcut will not be added by this method.

#### Something is broken/could be improved. How do I fix it?

Feel free to send me a request, and I will do my best to address any issues.

#### A command stopped working, what should I do?

If a command in the "Specific" tab used to work but no longer does, it might be due to an update in the xsetwacom drivers. These updates can change command names, and since the program relies on internal checks for commands, it may not reflect the most up-to-date xsetwacom implementation. Please issue a request informing me of any errors related to this issue.

#### Why is there no way simple way to configure tablet/stylus buttons?

This is a limitation I encountered while developing the interface. Unfortunately, I couldn't find an easy method to facilitate interactions with those settings. If you have any ideas, please send me a request.


## Tech Stack

**Front-end:** Java Swing

**Back-end:** Java, Lua
