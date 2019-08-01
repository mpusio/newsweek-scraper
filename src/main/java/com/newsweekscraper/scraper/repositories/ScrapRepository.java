package com.newsweekscraper.scraper.repositories;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Repository;

import java.io.IOException;

@Repository
public class ScrapRepository {

    public String scrapArticle(String url) {
        String contextOfArticle = "";

        try{
            Document doc = Jsoup.connect(url).get();
            Elements paragraphs = doc.getElementsByTag("p");
            for (Element paragraph : paragraphs) {
                contextOfArticle += paragraph.text() + "\n";
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

        return contextOfArticle;
    }
}
