import siteparsers.WikipediaParser;
import utils.HtmlFileReader;
import utils.TextFileWriter;

import java.io.FileNotFoundException;

public class Application {

    public static void main(String[] args) throws FileNotFoundException {

        // Read HTML file input
        String htmlFilePath = args[0];
        String textFilePath = args[1];
        System.out.println("######################################");
        System.out.println("Input File: " + htmlFilePath);
        System.out.println("Output File: " + textFilePath);
        System.out.println("######################################");
        System.out.println();

        System.out.println("Reading html file");
        String html = HtmlFileReader.readFile(htmlFilePath);

        // Convert into text
        WikipediaParser wikipediaParser = new WikipediaParser();
        String content = wikipediaParser.parseHtml(html);

        // Write text to file
        System.out.println("Writing text file");
        TextFileWriter.writeTextToFile(content, textFilePath);

    }
}
