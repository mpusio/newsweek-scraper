package com.newsweekscraper.scraper.models;

public class Article {
    private String URL;

    public Article(){

    }

    public Article(String URL) {
        this.URL = URL;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
