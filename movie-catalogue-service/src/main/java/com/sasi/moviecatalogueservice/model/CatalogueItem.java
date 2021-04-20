package com.sasi.moviecatalogueservice.model;

public class CatalogueItem {

    private String name;
    private String description;
    private int rating;

    public CatalogueItem(String name, String description, int rating) {
	super();
	this.name = name;
	this.description = description;
	this.rating = rating;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public int getRating() {
	return rating;
    }

    public void setRating(int rating) {
	this.rating = rating;
    }

    @Override
    public String toString() {
	return "CatologueItem [name=" + name + ", description=" + description + ", rating=" + rating + "]";
    }

}
