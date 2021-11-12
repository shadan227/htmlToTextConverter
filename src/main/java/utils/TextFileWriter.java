package utils;

import org.jsoup.internal.StringUtil;

import java.io.*;

public class TextFileWriter {

    public static void writeTextToFile(String text, String filePath) {

        try (FileWriter textFile = new FileWriter(filePath)) {
            textFile.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("File written successfully at path: " + filePath);
    }


}
