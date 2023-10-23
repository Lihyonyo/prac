package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Article {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String titles;
    @Column
    private String content;

    public Article(Long id, String titles, String content) {
        this.id = id;
        this.titles = titles;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", titles='" + titles + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
