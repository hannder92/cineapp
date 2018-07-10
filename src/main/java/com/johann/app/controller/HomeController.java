
package com.johann.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.johann.app.model.Movie;
import com.johann.app.service.IMovieService;
import com.johann.app.util.Utils;

@Controller
public class HomeController {

    @Autowired
    private IMovieService movieService;

    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    @RequestMapping(
            value = "/home",
            method = RequestMethod.GET)
    public String goHome() {
        return "home";
    }

    @RequestMapping(
            value = "/search",
            method = RequestMethod.POST)
    public String search(@RequestParam("date") String date, Model model) {
        List<String> dateList = Utils.getNextDays(4);
        List<Movie> movies = movieService.findAll();
        model.addAttribute("dates", dateList);
        model.addAttribute("movies", movies);
        model.addAttribute("searchDate", date);
        return "home";
    }

    @RequestMapping(
            value = "/",
            method = RequestMethod.GET)
    public String showPrincipal(Model model) {
        List<String> dateList = Utils.getNextDays(4);
        List<Movie> movies = movieService.findAll();
        model.addAttribute("dates", dateList);
        model.addAttribute("movies", movies);
        model.addAttribute("searchDate", dateFormat.format(new Date()));
        return "home";
    }

    // @RequestMapping(value = "/detail/{idMovie}/{date}", method = RequestMethod.GET)
    @RequestMapping(
            value = "/detail",
            method = RequestMethod.GET)
    public String showDetail(@RequestParam("idMovie") int idMovie,
            @RequestParam("date") String date, Model model) {

        System.out.println("Buscando horarios para la pelicula: " + idMovie);
        System.out.println("Para la fecha: " + date);
        model.addAttribute("movie", movieService.findById(idMovie));
        return "detail";
    }

}
