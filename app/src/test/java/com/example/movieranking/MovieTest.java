package com.example.movieranking;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rossmelville on 07/08/2017.
 */

public class MovieTest {

    Movie movie;

    @Before
    public void before() {
        movie = new Movie("The Godfather", "Crime", 1);
    }

    @Test
    public void canGetTitle() {
        assertEquals("The Godfather", movie.getTitle());
    }

    @Test
    public void canGetGenre() {
        assertEquals("Crime", movie.getGenre());
    }

    @Test
    public void canGetRanking() {
        assertEquals(1, movie.getRanking());
    }

    @Test
    public void canSetTitle() {
        movie.setTitle("The Godmother");
        assertEquals("The Godmother", movie.getTitle());
    }

    @Test
    public void canSetGenre() {
        movie.setGenre("Comedy");
        assertEquals("Comedy", movie.getGenre());
    }

    @Test
    public void canSetRanking() {
        movie.setRanking(5);
        assertEquals(5, movie.getRanking());
    }

    @Test
    public void canToString() {
        assertEquals("Title: The Godfather, Genre: Crime, Ranking: 1", movie.toString());
    }

}
