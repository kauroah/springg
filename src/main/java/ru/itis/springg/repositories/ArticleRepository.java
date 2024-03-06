package ru.itis.springg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.springg.models.Article;
import ru.itis.springg.models.User;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    boolean existsByArticleIdAndLikesContaining(Long articleId, User user);
}