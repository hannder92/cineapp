package com.johann.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.johann.app.model.Movie;
import com.johann.app.util.Utils;
import com.sun.corba.se.impl.javax.rmi.CORBA.Util;

@Controller
public class HomeController {

	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String goHome() {
		return "home";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showPrincipal(Model model) {
		List<String> dateList = Utils.getNextDays(4);
		List<Movie> movies = getList();
		model.addAttribute("dates", dateList);
		model.addAttribute("movies", movies);
		model.addAttribute("searchDate", dateFormat.format(new Date()));
		return "home";
	}

//	@RequestMapping(value = "/detail/{idMovie}/{date}", method = RequestMethod.GET)
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String showDetail(@RequestParam ("idMovie") int idMovie, @RequestParam ("date") String date, Model model) {

		System.out.println("Buscando horarios para la pelicula: " + idMovie);
		System.out.println("Para la fecha: " + date);
		
		
		
//		String movieTitle = "Fast & Furious";
//		int duration = 136;
//		double cost = 50;
//		model.addAttribute("title", movieTitle);
//		model.addAttribute("duration", duration);
//		model.addAttribute("cost", cost);
		return "detail";
	}

	private List<Movie> getList() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		List<Movie> list = null;
		try {
			list = new LinkedList<>();
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
			return list;
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
			return null;
		}

	}

}
