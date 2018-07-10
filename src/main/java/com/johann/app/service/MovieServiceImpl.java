
package com.johann.app.service;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.johann.app.model.Movie;

@Service
public class MovieServiceImpl implements IMovieService {

    private List<Movie> list = null;

    public MovieServiceImpl() {
        super();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        try {
            list = new LinkedList();
            Movie m1 = new Movie();
            m1.setId(1);
            m1.setTitle("Power Rangers");
            m1.setDuration(120);
            m1.setClassification("B");
            m1.setGenre("Adventure");
            m1.setPremiere(formatter.parse("02-05-2017"));

            Movie m2 = new Movie();
            m2.setId(2);
            m2.setTitle("The Beauty and the Best");
            m2.setDuration(132);
            m2.setClassification("A");
            m2.setGenre("Childs");
            m2.setPremiere(formatter.parse("20-05-2017"));
            m2.setImage("beauty.png");

            Movie m3 = new Movie();
            m3.setId(3);
            m3.setTitle("Setback");
            m3.setDuration(106);
            m3.setClassification("B");
            m3.setGenre("Thriller");
            m3.setPremiere(formatter.parse("02-05-2017"));
            m3.setImage("setback.png");

            Movie m4 = new Movie();
            m4.setId(4);
            m4.setTitle("Kong: Skull Island");
            m4.setDuration(118);
            m4.setClassification("B");
            m4.setGenre("Action and Adventure");
            m4.setPremiere(formatter.parse("06-06-2017"));
            m4.setImage("kong.png");
            m4.setStatus("Inactive");

            Movie m5 = new Movie();
            m5.setId(5);
            m5.setTitle("Life");
            m5.setDuration(104);
            m5.setClassification("B");
            m5.setGenre("Drama");
            m5.setPremiere(formatter.parse("10-06-2017"));
            m5.setImage("life.png");
            m5.setStatus("Active");

            list.add(m1);
            list.add(m2);
            list.add(m3);
            list.add(m4);
            list.add(m5);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    @Override
    public List<Movie> findAll() {
        return list;
    }

    @Override
    public Movie findById(int idMovie) {
        for (Movie movie : list) {
            if (movie.getId() == idMovie) {
                return movie;
            }
        }
        return null;
    }

    @Override
    public void insert(Movie movie) {
        list.add(movie);
    }

}
