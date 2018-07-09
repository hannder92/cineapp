package com.johann.app.model;

import java.util.Date;

public class Movie {

	private int id;
	private String title;
	private int duration;
	private String classification;
	private String genre;
	private String image = "cinema.png";
	private Date premiere;
	private String status = "Active";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getPremiere() {
		return premiere;
	}
	public void setPremiere(Date premiere) {
		this.premiere = premiere;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", duration=" + duration + ", classification=" + classification
				+ ", genre=" + genre + ", image=" + image + ", status=" + status + "]";
	}
	
	
	
	
}
