package com.example.ratingsservice.entity;

import javax.persistence.*;

@Entity
@Table(name = "ratings")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String movieId;
    private int rating;
    private String userId;  

    public Rating() {}

    public Rating(String movieId, int rating, String userId) {
        this.movieId = movieId;
        this.rating = rating;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}