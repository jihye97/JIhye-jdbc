package com.Jihye.jdbc.raw;

import java.util.List;
import com.Jihye.jdbc.template.ArticleDaoImplUsingTemplate;

public class ArticleMain {
    ArticleDao articleDao = new ArticleDaoImplUsingTemplate();

    /**
     * main 메서드
     */
    public static void main(String[] args) {
        new ArticleMain().listArticles();
        new ArticleMain().deleteArticle();
    }

    public void listArticles() {
        List<Article> articles = articleDao.listArticles();
        System.out.println(articles);
    }

    public void getArticle() {
        Article article = articleDao.getArticle("3");
        System.out.println(article);
    }

    public void addArticle() {
        Article article = new Article();
        article.setTitle("This is cute"); 
        article.setContent("This is cute");
        article.setUserId("1");
        article.setName("겸둥이");
        articleDao.addArticle(article);
    }

    public void updateArticle() {
        Article article = new Article();
        article.setArticleId("3");
        article.setTitle("This is modified title.");
        article.setContent("This is modified content");
        articleDao.updateArticle(article);
    }

    public void deleteArticle() {
        articleDao.deleteArticle("5");
    }
}