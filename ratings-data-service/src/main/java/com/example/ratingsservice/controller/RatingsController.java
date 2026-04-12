package com.example.ratingsservice.controller;

import com.example.ratingsservice.dto.UserRating;
import com.example.ratingsservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ratings")
public class RatingsController {

    @Autowired
    private RatingService ratingService; 

    @RequestMapping("/{userId}")
    public UserRating getRatingsOfUser(@PathVariable String userId) {
        return ratingService.getUserRatings(userId); 
    }
}