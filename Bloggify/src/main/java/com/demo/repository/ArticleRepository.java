package com.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.model.article;

@Repository("articleRepository")
public interface ArticleRepository {
	
	List<article> findAllArticles();

}
