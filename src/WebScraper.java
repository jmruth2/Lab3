import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
public class WebScraper {
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        int wordCount = 0;
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static int wordCount(String text) {
        int wordCount = 0;
        Scanner wordScanner = new Scanner(text);
        while (wordScanner.hasNext()) {
            wordCount++;
            wordScanner.next();
        }
        return wordCount;
    }

    public static int uniqueWordCount(String text, String word) {
        int wordCount = 0;
        Scanner wordScanner = new Scanner(text);
        while (wordScanner.hasNext()) {
            if (wordScanner.next().equalsIgnoreCase(word)) {
                wordCount++;
            }
        }
        return wordCount;
    }
}
