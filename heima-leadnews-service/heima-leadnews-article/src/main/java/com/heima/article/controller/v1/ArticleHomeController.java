package com.heima.article.controller.v1;

import com.heima.article.service.ArticleService;
import com.heima.common.constants.ArticleConstants;
import com.heima.model.article.dto.ArticleHomeDto;
import com.heima.model.common.dtos.ResponseResult;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/article")
@Api(value = "app端文章首页",tags = "app端文章首页")
@Slf4j
public class ArticleHomeController {
    @Autowired
    ArticleService articleService;
    @PostMapping("/load")
    public ResponseResult load(@RequestBody ArticleHomeDto articleHomeDto){
//        return articleService.load(ArticleConstants.LOADTYPE_LOAD_MORE,articleHomeDto);
        return articleService.load2(ArticleConstants.LOADTYPE_LOAD_MORE,articleHomeDto,true);
    }
    @PostMapping("/loadmore")
    public ResponseResult loadmore(@RequestBody ArticleHomeDto articleHomeDto){
        return articleService.load(ArticleConstants.LOADTYPE_LOAD_MORE,articleHomeDto);
    }
    @PostMapping("/loadnew")
    public ResponseResult loadnew(@RequestBody ArticleHomeDto articleHomeDto){
        return articleService.load(ArticleConstants.LOADTYPE_LOAD_NEW, articleHomeDto);
    }
}
