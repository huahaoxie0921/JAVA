package com.demo.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.article;
import com.demo.service.ArticleService;

public class app {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArticleService articleService = appContext.getBean("articleService", ArticleService.class);

		List<article> articles = articleService.findAllArticles();
		System.out.println("There are " + articles.size() + " articles.\n");
		for (article item : articles) {
			System.out.println("Title: " + item.getTitle());
			System.out.println("First 20 characters: " + item.getContent().substring(0, 21) + "...\n");
		}
	}

}
