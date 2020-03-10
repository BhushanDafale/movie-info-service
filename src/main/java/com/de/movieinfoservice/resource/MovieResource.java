package com.de.movieinfoservice.resource;

import com.de.movieinfoservice.resource.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/movie")
public class MovieResource {

    @GetMapping("/{movieId}")
    public Movie getMovie(@PathVariable("movieId") Integer movieId) {
        return new Movie(movieId, "Test Name");
    }

}
