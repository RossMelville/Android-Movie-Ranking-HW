package com.example.movieranking;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rossmelville on 07/08/2017.
 */

public class RankingTest {

    Ranking ranking;
    Movie movie1;
    Movie movie2;
    Movie movie3;
    Movie movie4;
    Movie movie5;
    Movie movie6;
    Movie movie7;
    Movie movie8;
    Movie movie9;
    Movie movie10;
    Movie movie11;

    @Before
    public void before() {
        ranking = new Ranking();
        movie1 = new Movie("The Godfather", "Crime", 1);
        movie2 = new Movie("The Shawshank Redemption", "Thriller", 2);
        movie3 = new Movie("Forrest Gump", "Drama", 3);
        movie4 = new Movie("The Dark Knight", "Fantasy", 4);
        movie5 = new Movie("Pulp Fiction", "Crime", 5);
        movie6 = new Movie("The Lord of the Rings: The Return of the King", "Fantasy", 6);
        movie7 = new Movie("Star Wars Episode V: The Empire Strikes Back", "Fantasy", 7);
        movie8 = new Movie("Saving Private Ryan", "War", 8);
        movie9 = new Movie("Back to the Future", "Fantasy", 9);
        movie10 = new Movie("Titanic", "Drama", 10);
        movie11 = new Movie("Goodfellas", "Crime", 11);
    }

    @Test
    public void canSetMovieToCorrectPosition() {
        ranking.addMovie(movie2);
        assertEquals("The Shawshank Redemption", ranking.getMovieByRanking(2));
    }

    @Test
    public void canReplaceNumberTenMovie() {
        ranking.addMovie(movie10);
        ranking.replaceLastMovie(movie11);
        assertEquals("Goodfellas", ranking.getMovieByRanking(10));
    }

    @Test
    public void canFindMovieByTitle() {
        ranking.addMovie(movie1);
        ranking.addMovie(movie2);
        ranking.addMovie(movie3);
        ranking.addMovie(movie4);
        ranking.addMovie(movie5);
        ranking.addMovie(movie6);
        ranking.addMovie(movie7);
        ranking.addMovie(movie8);
        ranking.addMovie(movie9);
        ranking.addMovie(movie10);
        assertEquals("Title: The Godfather, Genre: Crime, Ranking: 1", ranking.findMovieByTitle("The Godfather"));
    }

    @Test
    public void cantFindMovieByTitle() {
        ranking.addMovie(movie1);
        ranking.addMovie(movie2);
        ranking.addMovie(movie3);
        ranking.addMovie(movie4);
        ranking.addMovie(movie5);
        ranking.addMovie(movie6);
        ranking.addMovie(movie7);
        ranking.addMovie(movie8);
        ranking.addMovie(movie9);
        ranking.addMovie(movie10);
        assertEquals("Movie not found", ranking.findMovieByTitle("The Notebook"));
    }

    @Test
    public void canMoveMovieUp(){
        ranking.addMovie(movie1);
        ranking.addMovie(movie2);
        ranking.addMovie(movie3);
        ranking.addMovie(movie4);
        ranking.addMovie(movie5);
        ranking.addMovie(movie6);
        ranking.addMovie(movie7);
        ranking.addMovie(movie8);
        ranking.addMovie(movie9);
        ranking.addMovie(movie10);

        ranking.moveMovieUp(movie3);
        assertEquals("Forrest Gump", ranking.getMovieByRanking(2));
        assertEquals("The Shawshank Redemption", ranking.getMovieByRanking(3));
    }

    @Test
    public void canMoveMovieDown() {
        public void canMoveMovieUp(){
            ranking.addMovie(movie1);
            ranking.addMovie(movie2);
            ranking.addMovie(movie3);
            ranking.addMovie(movie4);
            ranking.addMovie(movie5);
            ranking.addMovie(movie6);
            ranking.addMovie(movie7);
            ranking.addMovie(movie8);
            ranking.addMovie(movie9);
            ranking.addMovie(movie10);

            ranking.moveMovieDown(movie4);
            assertEquals("The Dark Knight", ranking.getMovieByRanking(5));
            assertEquals("Pulp Fiction", ranking.getMovieByRanking(4));
    }
}
