package org.superbiz.moviefun.moviesapi;

public class MovieInfo {


    private long id;

    private String director;
    private String title;
    private int year;
    private String genre;
    private int rating;

    public MovieInfo() {
    }

    public MovieInfo(String title, String director, String genre, int rating, int year) {
        this.director = director;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
    }

    public MovieInfo(String director, String title, int year) {
        this.director = director;
        this.title = title;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public String getDirector() {
        return director;
    }


    public String getTitle() {
        return title;
    }


    public int getYear() {
        return year;
    }


    public String getGenre() {
        return genre;
    }


    public int getRating() {
        return rating;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
