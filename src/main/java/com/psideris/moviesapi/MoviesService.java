package com.psideris.moviesapi;

import com.psideris.moviesapi.records.Director;
import com.psideris.moviesapi.records.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class MoviesService {

    public List<Movie> getMovies() {
        return List.of(
                new Movie("1", getCreator(), true),
                new Movie("2", getCreator(), false),
                new Movie("3", getCreator(), true));
    }

    private Director getCreator() {
        List<String> names = List.of("Mike", "Mary", "Cassandra", "Juan", "Isidor");
        List<String> surnames = List.of("Wick", "Sparrow", "Poppins", "Corleone");

        return new Director(getRandom(names), getRandom(surnames));
    }

    private String getRandom(List<String> list) {
        return list.get(new Random().nextInt(list.size()));
    }

    public Movie addMovie(Movie movie) {
        return movie;
    }
}
