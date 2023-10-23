package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;

public class ArticleForm {
    private String titles;
    private String content;

    public ArticleForm(String titles, String content) {
        this.titles = titles;
        this.content = content;
    }
    @Override
    public String toString() {
        return "ArticleForm{" +
                "titles='" + titles + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Article toEntity() {
        return new Article(null,titles,content);
    }
}
