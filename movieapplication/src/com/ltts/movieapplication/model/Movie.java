package com.ltts.movieapplication.model;

public class Movie {
	
	private int movieId;
	private String movieName;
	private String director;
	//your guys have to use Release Data //
	//in table ypu have date field.
	//releaseDate;
	private String heroName;
	private String heroine;
	private String language;
	
	public Movie() {
		super();
	}
	public Movie(int movieId, String movieName, String director, String heroName, String heroine, String language) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.director = director;
		this.heroName = heroName;
		this.heroine = heroine;
		this.setLanguage(language);
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public String getHeroine() {
		return heroine;
	}
	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", director=" + director + ", heroName="
				+ heroName + ", heroine=" + heroine + "]";
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
		
	
	

}
