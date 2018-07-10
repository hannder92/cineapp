
package com.johann.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.johann.app.model.Movie;
import com.johann.app.service.IMovieService;

@Controller
@RequestMapping(
        value = "/movies")
public class MoviesController {

    @Autowired
    private IMovieService movieService;

    @GetMapping("/index")
    public String showIndex(Model model) {
        List<Movie> movies = movieService.findAll();
        model.addAttribute("movies", movies);
        return "movies/movieList";
    }

    @GetMapping(
            value = "/create")
    public String create() {
        return "movies/formMovie";
    }

    @PostMapping("/save")
    public String save(Movie movie, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println("hay Errores");
            return "movies/formMovie";
        }

        System.out.println("Guardando: " + movie);
        System.out.println("Tamaño List: " + movieService.findAll().size());
        movieService.insert(movie);
        System.out.println("Tamaño List Luego de Insertar: " + movieService.findAll().size());
        return "movies/formMovie";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
}
