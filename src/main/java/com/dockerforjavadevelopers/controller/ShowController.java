package com.dockerforjavadevelopers.controller;

import com.dockerforjavadevelopers.model.Show;
import com.dockerforjavadevelopers.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shows")
public class ShowController {

    @Autowired
    private ShowService showService;

    @GetMapping("/movie/{movieId}")
    public ResponseEntity<List<Show>> listShows(@PathVariable Long movieId) {
        List<Show> shows = showService.listShowsByMovieId(movieId);
        return ResponseEntity.ok(shows);
    }
}
