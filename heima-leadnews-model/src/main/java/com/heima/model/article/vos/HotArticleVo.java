package com.heima.model.article.vos;

import com.heima.model.article.pojo.ApArticle;
import lombok.Data;

@Data
public class HotArticleVo extends ApArticle {
    private Integer score;
}
