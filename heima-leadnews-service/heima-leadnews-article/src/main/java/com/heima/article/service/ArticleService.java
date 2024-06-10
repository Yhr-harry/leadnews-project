package com.heima.article.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.article.mapper.ApArticleMapper;
import com.heima.model.article.dto.ArticleDto;
import com.heima.model.article.dto.ArticleHomeDto;
import com.heima.model.article.pojo.ApArticle;
import com.heima.model.common.dtos.ResponseResult;
import org.apache.commons.net.nntp.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


public interface ArticleService extends IService<ApArticle> {
    ResponseResult load(Short loadtype, ArticleHomeDto articleHomeDto);
    ResponseResult load2(Short loadtype, ArticleHomeDto articleHomeDto, boolean firstPage);
    public ResponseResult saveArticle(ArticleDto dto);



}
