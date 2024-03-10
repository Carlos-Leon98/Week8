package com.swapi.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a category.
 * @author cleonrivas
 */
public class Category{

	@JsonProperty("image")
	private String image;

	@JsonProperty("creationAt")
	private String creationAt;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	@JsonProperty("updatedAt")
	private String updatedAt;

	/**
	 * Sets the image URL for the category.
	 *
	 * @param image The image URL.
	 */
	public void setImage(String image){
		this.image = image;
	}

	/**
	 * Gets the image URL from the category.
	 *
	 * @return The image URL.
	 */
	public String getImage(){
		return image;
	}

	/**
	 * Sets the creation date of the category.
	 *
	 * @param creationAt The creation date.
	 */
	public void setCreationAt(String creationAt){
		this.creationAt = creationAt;
	}

	/**
	 * Gets the creation date from the category.
	 *
	 * @return The creation date.
	 */
	public String getCreationAt(){
		return creationAt;
	}

	/**
	 * Sets the name for the category.
	 *
	 * @param name The name of the category.
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 * Gets the name of the category.
	 *
	 * @return The name of the category.
	 */
	public String getName(){
		return name;
	}

	/**
	 * Sets the ID for the category.
	 *
	 * @param id The ID.
	 */
	public void setId(int id){
		this.id = id;
	}

	/**
	 * Gets the ID from the category.
	 *
	 * @return The ID.
	 */
	public int getId(){
		return id;
	}

	/**
	 * Sets the last update timestamp for the category.
	 *
	 * @param updatedAt The last update timestamp.
	 */
	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	/**
	 * Gets the last update timestamp from the category.
	 *
	 * @return The last update timestamp.
	 */
	public String getUpdatedAt(){
		return updatedAt;
	}

	/**
	 * Generates a string representation of the Category object.
	 *
	 * @return A string representation of the object.
	 */
	@Override
 	public String toString(){
		return 
			"Category{" + 
			"image = '" + image + '\'' + 
			",creationAt = '" + creationAt + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",updatedAt = '" + updatedAt + '\'' + 
			"}";
		}
}