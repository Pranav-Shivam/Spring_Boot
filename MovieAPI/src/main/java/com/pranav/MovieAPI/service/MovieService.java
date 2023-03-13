package com.pranav.MovieAPI.service;

import com.pranav.MovieAPI.model.Movie;
import com.pranav.MovieAPI.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies()
    {
        return movieRepository.findAll();
    }

    public Optional<Movie> getOneMove(String id)
    {
        return movieRepository.findMovieByImdbId(id);
    }
}
