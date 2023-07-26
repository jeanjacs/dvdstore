package com.cige.dvdstore.service;

import com.cige.dvdstore.entity.Movie;
import com.cige.dvdstore.repository.MovieRepository;

public class MovieService {
    public void registerMovie(Movie movie) {
        MovieRepository movieRepository = new MovieRepository();
        movieRepository.add(movie);
    }
}
