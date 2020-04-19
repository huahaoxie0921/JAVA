package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.article;
import com.demo.repository.ArticleRepository;

@Service("articleService")
public class ArticleServiceImple implements ArticleService {
	
	@Autowired
	private ArticleRepository articleService;

	public ArticleRepository getArticleService() {
		return articleService;
	}

	public void setArticleService(ArticleRepository articleService) {
		this.articleService = articleService;
	}
	
	public List<article> findAllArticles(){
		return articleService.findAllArticles();
	}

}
