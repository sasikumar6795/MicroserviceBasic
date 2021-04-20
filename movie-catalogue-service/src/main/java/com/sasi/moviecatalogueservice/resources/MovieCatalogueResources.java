package com.sasi.moviecatalogueservice.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sasi.moviecatalogueservice.model.CatalogueItem;

@RestController
@RequestMapping("/catalogue")
public class MovieCatalogueResources {

    
    @GetMapping("/catalogue/{userId}")
    public List<CatalogueItem> getCatalogue(@PathVariable String userId) {
	return Collections.singletonList(new CatalogueItem("Transformers", "Test", 4));
    }
}
