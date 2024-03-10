package com.swapi.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

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

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setCreationAt(String creationAt){
		this.creationAt = creationAt;
	}

	public String getCreationAt(){
		return creationAt;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
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
			"Category{" + 
			"image = '" + image + '\'' + 
			",creationAt = '" + creationAt + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",updatedAt = '" + updatedAt + '\'' + 
			"}";
		}
}