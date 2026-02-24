package me.dio.dto;

import me.dio.domain.model.Account;
import me.dio.domain.model.Card;
import me.dio.domain.model.Feature;
import me.dio.domain.model.News;
import me.dio.domain.model.User;

import java.util.List;

public class UserResponseDTO {

    private Long id;
    private String name;
    private Account account;
    private Card card;
    private List<Feature> features;
    private List<News> news;

    public UserResponseDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.account = user.getAccount();
        this.card = user.getCard();
        this.features = user.getFeatures();
        this.news = user.getNews();
    }

    // Getters and Setters
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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }
}