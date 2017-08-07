package com.example.movieranking;

/**
 * Created by rossmelville on 07/08/2017.
 */

public class Ranking {

    private Movie[] rankings;

    public void Ranking() {
        this.rankings = new Movie[10] ;
    }

    public void addMovie(Movie newMovie) {
        int rank = newMovie.getRanking() - 1;
        rankings[rank] = (newMovie);
    }

    public String getMovieByRanking(int rank) {
        int location = rank - 1;
        Movie foundMovie = rankings[location];
        return foundMovie.getTitle();
    }

}
