package com.heima.article.service;

import com.heima.model.article.pojo.ApArticle;

public interface ArticleFreemarkerService {
    public void buildArticleToMinIO(ApArticle apArticle, String content);
}
