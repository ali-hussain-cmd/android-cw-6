package com.example.cw6;

public class Movie {
    private String title;
   private String mainactor;
    private double movierate;
   private  int pgrate;
    private String genre;

    public Movie(String title, String mainactor, double movierate, int pgrate, String genre) {
        this.title = title;
        this.mainactor = mainactor;
        this.movierate = movierate;
        this.pgrate = pgrate;
        this.genre = genre;


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainactor() {
        return mainactor;
    }

    public void setMainactor(String mainactor) {
        this.mainactor = mainactor;
    }

    public double getMovierate() {
        return movierate;
    }

    public void setMovierate(double movierate) {
        this.movierate = movierate;
    }

    public int getPgrate() {
        return pgrate;
    }

    public void setPgrate(int pgrate) {
        this.pgrate = pgrate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
