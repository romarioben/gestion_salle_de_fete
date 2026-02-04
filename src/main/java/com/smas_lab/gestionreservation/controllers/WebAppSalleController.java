package com.smas_lab.gestionreservation.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smas_lab.gestionreservation.models.Salle;
import com.smas_lab.gestionreservation.services.SalleService;

@Controller
@RequestMapping("/")
public class WebAppSalleController {
	
	@Autowired
	private SalleService salleService;
	
	@RequestMapping("/")
	public String home(ModelMap modelMap) {
		List<Salle> salles = salleService.getAllSalles();
		modelMap.addAttribute("salles", salles);
		return "home";
	}
	
	@RequestMapping("/salles")
	public String salles(ModelMap modelMap) {
		List<Salle> salles = salleService.getAllSalles();
		modelMap.addAttribute("salles", salles);
		return "salles";
	}
	
	@GetMapping("/salle/{id}")
	public String getSalle(ModelMap modelMap, @PathVariable("id") Long studentId) {
		Optional<Salle> existingSalle = salleService.getSalleById(studentId);
		
		if (existingSalle.isPresent()) {
			Salle salle = existingSalle.get();
			modelMap.addAttribute("salle", salle);
		}
		
		return "salle";
	}
}
