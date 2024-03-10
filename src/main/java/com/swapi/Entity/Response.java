package com.swapi.Entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.swapi.Entity.Category;

public class Response{

	@JsonProperty("images")
	private List<String> images;

	@JsonProperty("creationAt")
	private String creationAt;

	@JsonProperty("price")
	private int price;

	@JsonProperty("description")
	private String description;

	@JsonProperty("id")
	private int id;

	@JsonProperty("title")
	private String title;

	@JsonProperty("category")
	private Category category;

	@JsonProperty("updatedAt")
	private String updatedAt;

	public void setImages(List<String> images){
		this.images = images;
	}

	public List<String> getImages(){
		return images;
	}

	public void setCreationAt(String creationAt){
		this.creationAt = creationAt;
	}

	public String getCreationAt(){
		return creationAt;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return price;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setCategory(Category category){
		this.category = category;
	}

	public Category getCategory(){
		return category;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"images = '" + images + '\'' + 
			",creationAt = '" + creationAt + '\'' + 
			",price = '" + price + '\'' + 
			",description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",category = '" + category + '\'' + 
			",updatedAt = '" + updatedAt + '\'' + 
			"}";
		}
}