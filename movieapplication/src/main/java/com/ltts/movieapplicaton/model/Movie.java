package com.ltts.movieapplicaton.model;

public class Movie {
	
	private int movieid;
	private String moviename;
	private String director;
	private String heroname;
	private String heroine;
	private String releasedate;
	private String language;
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", moviename=" + moviename + ", director=" + director + ", heroname="
				+ heroname + ", heroine=" + heroine + ", releasedate=" + releasedate + ", language=" + language + "]";
	}
	public Movie() {
		super();
	}
	public Movie(int movieid, String moviename, String director, String heroname, String heroine, String releasedate,
			String language) {
		super();
		this.movieid = movieid;
		this.moviename = moviename;
		this.director = director;
		this.heroname = heroname;
		this.heroine = heroine;
		this.releasedate = releasedate;
		this.language = language;
	}
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getHeroname() {
		return heroname;
	}
	public void setHeroname(String heroname) {
		this.heroname = heroname;
	}
	public String getHeroine() {
		return heroine;
	}
	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}
	public String getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	
	

}
