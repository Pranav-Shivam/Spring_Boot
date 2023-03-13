package com.pranav.MovieAPI.controller;

import com.pranav.MovieAPI.model.Review;
import com.pranav.MovieAPI.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/pra/review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String,String> payload)
    {
        return new ResponseEntity<Review>
                (reviewService.createReview(payload.get("reviewBody"),payload.get("imdbId")),
                HttpStatus.CREATED);
    }
}
