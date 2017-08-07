package com.example.movieranking;

import org.junit.Before;

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
    }
}
