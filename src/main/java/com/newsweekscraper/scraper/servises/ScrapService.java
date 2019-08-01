package com.newsweekscraper.scraper.servises;

import com.newsweekscraper.scraper.repositories.ScrapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScrapService {
    private ScrapRepository scrapRepository;

    @Autowired
    public ScrapService(ScrapRepository scrapRepository) {
        this.scrapRepository = scrapRepository;
    }

    public String getScrapedContext(String url) {
        String context = scrapRepository.scrapArticle(url);
        return context;
    }
}
