# HTML To Text Converter
This project is used to extract the text from HTML files and save it in a text file

# Get Started
Clone the repository
Open the repository in IntelliJ IDEA as a maven project
Go to File > Settings > Plugins, and install the plugin: Maven Helper
Right click on the project root [HtmlToTextConverter] in the Project menu, selet 'Run Maven' option and then 'clean install'
The executable jar HtmlToTextConverter-<Version>-SNAPSHOT.jar is now generated in the target folder

# Extracting text using the jar
Navigate to the folder where HtmlToTextConverter jar is present
Rename the executable jar HtmlToTextConverter-<Version>-SNAPSHOT.jar to HtmlToTextConverter.jar
Open the command prompt in the same folder
Run command: java -jar HtmlToTextConverter.jar <htmlSourceFilePath> <textFilePath>
