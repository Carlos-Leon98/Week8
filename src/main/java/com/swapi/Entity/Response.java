package com.swapi.Entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.swapi.Entity.Category;

/**
 * Represents a product
 * @author cleonrivas
 */
public class Response {

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

	/**
	 * Sets the list of images for the response.
	 *
	 * @param images The list of images.
	 */
	public void setImages(List<String> images){
		this.images = images;
	}

	/**
	 * Gets the list of images from the response.
	 *
	 * @return The list of images.
	 */
	public List<String> getImages(){
		return images;
	}

	/**
	 * Sets the creation date of the response.
	 *
	 * @param creationAt The creation date.
	 */
	public void setCreationAt(String creationAt){
		this.creationAt = creationAt;
	}

	/**
	 * Gets the creation date from the response.
	 *
	 * @return The creation date.
	 */
	public String getCreationAt(){
		return creationAt;
	}

	/**
	 * Sets the price for the response.
	 *
	 * @param price The price.
	 */
	public void setPrice(int price){
		this.price = price;
	}

	/**
	 * Gets the price from the response.
	 *
	 * @return The price.
	 */
	public int getPrice(){
		return price;
	}

	/**
	 * Sets the description for the response.
	 *
	 * @param description The description.
	 */
	public void setDescription(String description){
		this.description = description;
	}

	/**
	 * Gets the description from the response.
	 *
	 * @return The description.
	 */
	public String getDescription(){
		return description;
	}

	/**
	 * Sets the ID for the response.
	 *
	 * @param id The ID.
	 */
	public void setId(int id){
		this.id = id;
	}

	/**
	 * Gets the ID from the response.
	 *
	 * @return The ID.
	 */
	public int getId(){
		return id;
	}

	/**
	 * Sets the title for the response.
	 *
	 * @param title The title.
	 */
	public void setTitle(String title){
		this.title = title;
	}

	/**
	 * Gets the title from the response.
	 *
	 * @return The title.
	 */
	public String getTitle(){
		return title;
	}

	/**
	 * Sets the category for the response.
	 *
	 * @param category The category.
	 */
	public void setCategory(Category category){
		this.category = category;
	}

	/**
	 * Gets the category from the response.
	 *
	 * @return The category.
	 */
	public Category getCategory(){
		return category;
	}

	/**
	 * Sets the last update timestamp for the response.
	 *
	 * @param updatedAt The last update timestamp.
	 */
	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	/**
	 * Gets the last update timestamp from the response.
	 *
	 * @return The last update timestamp.
	 */
	public String getUpdatedAt(){
		return updatedAt;
	}

	/**
	 * Generates a string representation of the Response object.
	 *
	 * @return A string representation of the object.
	 */
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