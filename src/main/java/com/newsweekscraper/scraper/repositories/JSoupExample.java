//package com.newsweekscraper.scraper.repositories;
//
//import org.jsoup.Jsoup;
//import org.jsoup.helper.Validate;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//import java.io.IOException;
//
//
//public class JSoupExample {
//
//    public static void main(String[] args) throws IOException {
//        Document doc = Jsoup.connect("https://www.newsweek.pl/swiat/jeff-bezos-elon-musk-i-richard-branson-prywaciarze-w-kosmosie/xnbslzb").get();
//        Elements paragraphs = doc.getElementsByTag("p");
//        for (Element paragraph : paragraphs) {
//            System.out.println(paragraph.text());
//        }
//    }
//}
