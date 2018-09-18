public class Main {

    public static void main(String[] args) {
        String url = "https://www.bls.gov/tus/charts/chart9.txt";
        System.out.println(WebScraper.urlToString(url));
        System.out.println("Word count: " + WebScraper.wordCount(WebScraper.urlToString(url)));
        System.out.println("Unique word count: " + WebScraper.uniqueWordCount(WebScraper.urlToString(url), "data"));
    }
}
