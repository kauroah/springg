package ru.itis.springg.services;

import ru.itis.springg.dto.ArticleDto;
import ru.itis.springg.dto.ArticleForm;

import java.util.List;

public interface ArticleService {
    List<ArticleDto> getByUser(Long userId);

    ArticleDto addArticle(Long userId, ArticleForm articleForm);

    ArticleDto like(Long userId, Long articleId);
}