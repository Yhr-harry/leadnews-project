package com.heima.model.article.dto;

import com.heima.model.article.pojo.ApArticle;
import lombok.Data;

@Data
public class ArticleDto extends ApArticle {
    private String content;
}
