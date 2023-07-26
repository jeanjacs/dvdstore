package com.cige.dvdstore.repository;

import com.cige.dvdstore.entity.Movie;

import java.util.ArrayList;

public class MovieRepository {
    private static ArrayList<Movie> movies = new ArrayList<Movie>();
    public void add(Movie movie) {
        movies.add(movie);
        System.out.println( "The movie " + movie.getTitle() + " has been added." );
    }
}
