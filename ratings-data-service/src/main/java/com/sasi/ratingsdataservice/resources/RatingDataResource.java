package com.sasi.ratingsdataservice.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sasi.ratingsdataservice.model.Rating;

@RestController
@RequestMapping("/ratingsData")
public class RatingDataResource {

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable String movieId) {
	return new Rating(movieId, 4);
    }

}
