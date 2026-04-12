package com.example.ratingsservice.service;

import com.example.ratingsservice.entity.Rating;
import com.example.ratingsservice.dto.UserRating;
import com.example.ratingsservice.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    public UserRating getUserRatings(String userId) {
        List<Rating> ratings = ratingRepository.findByUserId(userId);
        return new UserRating(ratings);
    }
}