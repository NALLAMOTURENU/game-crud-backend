package com.Timepassgames.game_crud_backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "games")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Builder
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String url;

    @Column(nullable = false)
    private String author;

    @Column(name = "published_date", nullable = false)
    private LocalDate publishedDate;

    public Game(){

    }

    public Game(Long id, String name, String url, String author, LocalDate publishedDate) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.author = author;
        this.publishedDate = publishedDate;
    }

    public Game(LocalDate publishedDate, String author, String url, String name) {
        this.publishedDate = publishedDate;
        this.author = author;
        this.url = url;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }
}