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

}
