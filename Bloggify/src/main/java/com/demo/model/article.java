package com.demo.model;

public class article {
	
	private int articleId;
	private String title;
	private String content;
	private user creater;
	public user getCreater() {
		return creater;
	}

	public void setCreater(user creater) {
		this.creater = creater;
	}

	public int getArticleId() {
		return articleId;
	}
	
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
