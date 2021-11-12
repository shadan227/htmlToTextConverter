# HTML To Text Converter
This project is used to extract the text from HTML files and save it in a text file

# Get Started
1. Clone the repository
2. Open the repository in IntelliJ IDEA as a maven project
3. Go to File > Settings > Plugins, and install the plugin: Maven Helper
4. Right click on the project root [HtmlToTextConverter] in the Project menu, selet 'Run Maven' option and then 'clean install'


# Running from IntelliJ
1. From the Run menu in the menu bar, select Edit Configurations
2. Add the name of the Application instance as "Test"
3. Under "Build and run" section, select the "Application" class as main class
4. In the Program arguments, enter the \<htmlSourceFilePath\> and \<textFilePath\> in double quotes separated by single space
5. Press Apply and then OK
6. From the Run menu, click Run and select your run configuration
7. Your text file should be generated at the expected path. See console output for details.


# Extracting text using the jar
1. Find the executable jar HtmlToTextConverter-\<Version\>-SNAPSHOT.jar generated in the target folder
2. Navigate to the folder where HtmlToTextConverter jar is present
3. Rename the executable jar HtmlToTextConverter-\<Version\>-SNAPSHOT.jar to HtmlToTextConverter.jar
4. Open the command prompt in the same folder
5. Run command: java -jar HtmlToTextConverter.jar \<htmlSourceFilePath\> \<textFilePath\>
