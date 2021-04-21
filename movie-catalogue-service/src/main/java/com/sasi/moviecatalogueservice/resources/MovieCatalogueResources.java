package com.sasi.moviecatalogueservice.resources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.sasi.moviecatalogueservice.model.CatalogueItem;
import com.sasi.moviecatalogueservice.model.Movie;
import com.sasi.moviecatalogueservice.model.Rating;

@RestController
@RequestMapping("/catalogue")
public class MovieCatalogueResources {

    @Autowired
    RestTemplate restTemplate;
    
    @Autowired
    WebClient.Builder webClientBuilder;

    @GetMapping("/{userId}")
    public List<CatalogueItem> getCatalogue(@PathVariable String userId) {

	// get all rated movieids

	List<Rating> ratings = Arrays.asList(new Rating("1234", 4), new Rating("5678", 5));

	return ratings.stream().map(rating -> {
	    Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), Movie.class);
	    return new CatalogueItem(movie.getName(), "desc", rating.getRating());
	}).collect(Collectors.toList());

	// for each movieid call movie info service and get the details

	// put them all together

    }
}
