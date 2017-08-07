package com.example.movieranking;

/**
 * Created by rossmelville on 07/08/2017.
 */

public class Ranking {

    private Movie[] rankings;

    public Ranking() {
        this.rankings = new Movie[10];
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
        for (Movie m : rankings) {
            if (m.getTitle() == title)
                return m.toString();
        }
        return "Movie not found";
    }

    public void moveMovieUp(Movie movieUp) {
        int rankDown = movieUp.getRanking() - 1;
        int rankUp = movieUp.getRanking() - 2;
        Movie movieDown = rankings[rankUp];
        movieUp.setRanking(rankUp);
        movieDown.setRanking(rankDown);
        rankings[rankUp] = movieUp;
        rankings[rankDown] = movieDown;
    }

    public void moveMovieDown(Movie movieDown) {
        int rankDown = movieDown.getRanking();
        int rankUp = movieDown.getRanking() - 1;
        Movie movieUp = rankings[rankDown];
        movieUp.setRanking(rankUp);
        movieDown.setRanking(rankDown);
        rankings[rankUp] = movieUp;
        rankings[rankDown] = movieDown;
    }


}
