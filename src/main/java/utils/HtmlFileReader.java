package utils;

import org.jsoup.internal.StringUtil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HtmlFileReader {

    public static String readFile(String filePath) throws FileNotFoundException {

        if (StringUtil.isBlank(filePath)) {
            throw new NullPointerException(String.format("Invalid file path: '%s'", filePath));
        }

        String str;
        StringBuilder strb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((str = br.readLine()) != null) {
                strb.append(str).append("\n");
            }
        } catch (FileNotFoundException f) {
            throw new FileNotFoundException("Error in reading file: " + f.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Html file read from path: " + filePath);
        return strb.toString();
    }
}
