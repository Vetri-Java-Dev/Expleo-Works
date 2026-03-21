package MovieBooking;

import java.text.DateFormat;
import java.time.LocalDate;

public class Movie {
	
	private String title;
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	private String description;
	private int rating;
	private String language;
	private LocalDate releaseDate;
	private String country;
	
	public Movie(String title, String description, int rating, String language, LocalDate releaseDate,
			String country, String genre) {
		this.title = title;
		this.description = description;
		this.rating = rating;
		this.language = language;
		this.releaseDate = releaseDate;
		this.country = country;
		this.genre = genre;
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
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getMovieDetails() {
	    return "Movie title : "+title+
	           "\nDescription : " +description+ 
	           "\nRating : "+rating+
	           "\nLanguage : "+language+
	           "\nRelease Date : "+releaseDate+
	           "\nCountry : "+country+
	           "\nGenre : "+genre;
	}	
	
	
}
