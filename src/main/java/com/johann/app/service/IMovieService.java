
package com.johann.app.service;

import java.util.List;

import com.johann.app.model.Movie;

public interface IMovieService {

    void insert(Movie movie);

    List<Movie> findAll();

    Movie findById(int idMovie);
}
