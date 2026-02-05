package com.smas_lab.gestionreservation.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smas_lab.gestionreservation.models.Salle;
import com.smas_lab.gestionreservation.services.SalleService;

@Controller
//@RequestMapping("/")
public class WebAppSalleController {
	
	@Autowired
	private SalleService salleService;
	
	@GetMapping("/")
	public String home(ModelMap modelMap) {
		List<Salle> salles = salleService.getAllSalles();
		modelMap.addAttribute("salles", salles);
		return "home";
	}
	
	@GetMapping("/salles")
	public String salles(ModelMap modelMap) {
		List<Salle> salles = salleService.getAllSalles();
		modelMap.addAttribute("salles", salles);
		return "salles";
	}
	
	@GetMapping("/salle/{id}")
	public String getSalle(ModelMap modelMap, @PathVariable("id") Long salleId) {
		Optional<Salle> existingSalle = salleService.getSalleById(salleId);
		
		if (existingSalle.isPresent()) {
			Salle salle = existingSalle.get();
			modelMap.addAttribute("salle", salle);
			modelMap.addAttribute("pageTitle", String.format("Mettre à jour la salle: %s.", salle.getNom()));
		}
		
		return "salle";
	}
	
	@GetMapping("/salle/delete/{id}")
	public String deleteSalle(ModelMap modelMap, @PathVariable("id") Long studentId) {
		Optional<Salle> existingSalle = salleService.getSalleById(studentId);
		
		if (existingSalle.isPresent()) {
			Salle salle = existingSalle.get();
			salleService.deleteSalle(salle);
			List<Salle> salles = salleService.getAllSalles();
			modelMap.addAttribute("salles", salles);
		}
		
		return "redirect:/salles";
	}
	
	@PostMapping("/salle/{id}")
	public String updateSalle(ModelMap modelMap, @PathVariable("id") Long salleId, @ModelAttribute Salle salleData) {
		Optional<Salle> existingSalle = salleService.getSalleById(salleId);
		
		if (existingSalle.isPresent()) {
			Salle salle = existingSalle.get();
			salle.setNom(salleData.getNom());
			salle.setCapacite(salleData.getCapacite());
			salle.setLocalisation(salleData.getLocalisation());
			salle.setDisponible(salleData.getDisponible());
			salleService.saveSalle(salle);
			modelMap.addAttribute("salle", salle);
		}
		
		return String.format("redirect:/salle/%d", salleId);
	}
	
	
	@GetMapping("/salle/create")
	public String createGetSalle(ModelMap modelMap) {
		Salle salle = new Salle();
		modelMap.addAttribute("salle", salle);
		modelMap.addAttribute("pageTitle", "Ajouter une nouvelle salle");
		return "salle";
	}
	
	
	@PostMapping("/salle/create")
	public String createSalle(ModelMap modelMap, @ModelAttribute Salle salleData) {
		Salle salle = salleService.saveSalle(salleData);
		modelMap.addAttribute("sale", salle);
		List<Salle> salles = salleService.getAllSalles();
		modelMap.addAttribute("salles", salles);
		return "redirect:/salles";
	}
	
	@PostMapping("salles/search")
	public String searchSalleByNom(ModelMap modelMap,@RequestParam String nom) {
		List<Salle> salles = salleService.findByNom(nom);
		modelMap.addAttribute("salles", salles);
		return "salles";
	}
}
