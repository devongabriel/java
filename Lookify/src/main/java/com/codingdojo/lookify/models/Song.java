package com.codingdojo.lookify.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="songs")
public class Song {
	
    // -----------------	
    //   Table
    // -----------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min = 5, max=30, message=" - Title must be a minimum of 5 characters")
	private String title;
	
	@Size(min = 5, max=30, message=" - Artist must be a minimum of 5 characters")
	private String artist;
	
	private Integer rating;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;
	
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    // -----------------	
    //   Constructor
    // -----------------	
    public Song() {
    }
    
    public Song(Long id, String title, String artist, Integer rating) {
    	this.id = id;
    	this.title = title;
    	this.artist = artist;
    	this.rating = rating;
    }
    // -----------------	
    //   Getters & Setters
    // -----------------
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public Integer getRating() {
		return rating;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
    
	

}
