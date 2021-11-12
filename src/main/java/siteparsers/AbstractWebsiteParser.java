package siteparsers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public abstract class AbstractWebsiteParser implements WebsiteParser {

    @Override
    public String parseHtml(String html) {
        System.out.println("Converting html into Text");
        Document document = Jsoup.parse(html);
        return document.select("p").text();
    }
}
