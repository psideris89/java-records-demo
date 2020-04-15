package com.psideris.moviesapi;

import com.psideris.moviesapi.records.Movie;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MoviesController {

    private MoviesService moviesService;

    public MoviesController(MoviesService moviesService) {
        this.moviesService = moviesService;
    }

    @GetMapping("/movies")
    public List<Movie> getBooks() {
        return moviesService.getMovies();
    }

    @GetMapping("/movies/{id}")
    public Movie getBook(@PathVariable String id) {
        return moviesService.getMovies()
                            .stream()
                            .filter(s -> s.id().equals(id))
                            .findFirst()
                            .orElseThrow(() -> new RuntimeException("Not found"));
    }

    @PostMapping("/movies")
    public Movie addMovie(@RequestBody Movie movie) {
        return moviesService.addMovie(movie);
    }
}
