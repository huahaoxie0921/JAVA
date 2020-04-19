package com.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.model.article;
import com.demo.model.user;

@Repository("articleRepository")
public class ArticleRepositoryImple implements ArticleRepository {
	
	public List<article> findAllArticles(){
		List<article> articleList = new ArrayList<>(); 
		
		user user1 = new user();
		user1.setUserId(1);
		user1.setUserName("Huahao");
		user1.setPassword("password");
		
		user user2 = new user();
		user2.setUserId(2);
		user2.setUserName("Frank");
		user2.setPassword("password");
		
		article article1 = new article();
		article1.setArticleId(1);
		article1.setTitle("First blog in the Bloggify");
		article1.setContent("This is the first blog posted in the bloggify. Later, we will move this aritle into the Database!");
		article1.setCreater(user1);
		
		article article2 = new article();
		article2.setArticleId(2);
		article2.setTitle("Annotation introduction");
		article2.setContent("The Java Programming language provided support for Annotations from Java 5.0. Leading Java frameworks were quick to adopt annotations and the Spring Framework started using annotations from the release 2.5. Due to the way they are defined, annotations provide a lot of context in their declaration.");
		article2.setCreater(user2);
		
		articleList.add(article1);
		articleList.add(article2);
		return articleList;
	}

}
