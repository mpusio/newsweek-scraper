package com.newsweekscraper.scraper.controllers;

import com.newsweekscraper.scraper.models.Article;
import com.newsweekscraper.scraper.servises.ScrapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ScrapController {

    private ScrapService scrapService;

    @Autowired
    public ScrapController(ScrapService scrapService) {
        this.scrapService = scrapService;
    }

    @GetMapping("/")
    public String getMainPage(Article article, Model model){
        model.addAttribute("article", article);
        return "index";
    }

    @PostMapping("/")
    public String scrapArticle(Article article, Model model){
        String context = scrapService.getScrapedContext(article.getURL());
        model.addAttribute("context", context);
        return "scraped";
    }
}
