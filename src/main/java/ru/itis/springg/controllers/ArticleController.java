package ru.itis.springg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.itis.springg.dto.ArticleForm;
import ru.itis.springg.services.ArticleService;

@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;


    @PostMapping("/users/{user-id}/articles")
    @ResponseBody
    public String addArticle(@PathVariable("user-id") Long userId,
                             @RequestBody ArticleForm articleForm) {
         articleService.addArticle(userId, articleForm);
        return  "redirect:/users/{user-id}/articles";

    }
    @GetMapping("/users/{user-id}/articles")
    public String getArticlesOfUser(@PathVariable("user-id") Long userId, Model model) {
        model.addAttribute("user_id", userId);
        model.addAttribute("articles", articleService.getByUser(userId));
        return "article_page";
    }

    @PostMapping("/users/{user-id}/articles/{article-id}/like")
    @ResponseBody
    public Object like(@PathVariable ("user-id") Long userId,
                       @PathVariable ("article-id") Long articleId) {
        return articleService.like(userId, articleId);
    }
}

