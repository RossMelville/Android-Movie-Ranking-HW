package com.example.movieranking;

/**
 * Created by rossmelville on 07/08/2017.
 */

public class Ranking {

    private Movie[] rankings;

    public Ranking() {
        this.rankings = new Movie[10] ;
    }

    public void addMovie(Movie newMovie) {
        int rank = newMovie.getRanking() - 1;
        rankings[rank] = newMovie;
    }

    public String getMovieByRanking(int rank) {
        int location = rank - 1;
        Movie foundMovie = rankings[location];
        return foundMovie.getTitle();
    }

    public void replaceLastMovie(Movie newMovie) {
        newMovie.setRanking(10);
        rankings[9] = newMovie;
    }

    public String findMovieByTitle(String title) {
        for(Movie m : rankings) {
            if(m.getTitle() == title)
                return m.toString();
        }
        return "Movie not found";
    }

    public void moveMovieUp(Movie movie) {
    }
}
