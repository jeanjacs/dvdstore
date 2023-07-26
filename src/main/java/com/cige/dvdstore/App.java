package com.cige.dvdstore;

import com.cige.dvdstore.entity.Movie;
import com.cige.dvdstore.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Quel est le titre du film: " );
        String title = sc.nextLine();
        System.out.print( "Quel est le genre du film: ");
        String genre = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        MovieService movieService = new MovieService();
        movieService.registerMovie(movie);
    }
}
