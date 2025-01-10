package com.dockerforjavadevelopers.controller;

import com.dockerforjavadevelopers.model.Movie;
import com.dockerforjavadevelopers.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/city/{cityId}")
    public ResponseEntity<List<Movie>> listMovies(@PathVariable Long cityId) {
        List<Movie> movies = movieService.listMoviesByCity(cityId);
        return ResponseEntity.ok(movies);
    }
}
