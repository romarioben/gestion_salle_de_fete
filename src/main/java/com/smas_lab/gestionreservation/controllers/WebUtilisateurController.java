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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.smas_lab.gestionreservation.models.Utilisateur;
import com.smas_lab.gestionreservation.services.UtilisateurService;

@Controller
//@RequestMapping("/")
public class WebUtilisateurController {
	
	@Autowired
	private UtilisateurService utilisateurService;
	
	@GetMapping("/utilisateurs")
	public String utilisateurs(ModelMap modelMap) {
		List<Utilisateur> utilisateurs = utilisateurService.getAllUtilisateurs();
		modelMap.addAttribute("utilisateurs", utilisateurs);
		return "utilisateurs";
	}
	
	@GetMapping("/utilisateur/{id}")
	public String getUtilisateur(ModelMap modelMap, @PathVariable("id") Long utilisateurId) {
		Optional<Utilisateur> existingUtilisateur = utilisateurService.getUtilisateurById(utilisateurId);
		
		if (existingUtilisateur.isPresent()) {
			Utilisateur utilisateur = existingUtilisateur.get();
			modelMap.addAttribute("utilisateur", utilisateur);
			modelMap.addAttribute("pageTitle", String.format("Mettre à jour l'utilisateur: %s.", utilisateur.getNom()));
		}
		
		return "utilisateur";
	}
	
	@GetMapping("/utilisateur/delete/{id}")
	public String deleteSalle(ModelMap modelMap, @PathVariable("id") Long studentId) {
		Optional<Utilisateur> existingUtilisateur = utilisateurService.getUtilisateurById(studentId);
		
		if (existingUtilisateur.isPresent()) {
			Utilisateur utilisateur = existingUtilisateur.get();
			utilisateurService.deleteUtilisateur(utilisateur);
			List<Utilisateur> utilisateurs = utilisateurService.getAllUtilisateurs();
			modelMap.addAttribute("utilisateurs", utilisateurs);
		}
		
		return "redirect:/utilisateurs";
	}
	
	@PostMapping("/utilisateur/{id}")
	public String updateUtilisateur(ModelMap modelMap, @PathVariable("id") Long utilisateurId, @ModelAttribute Utilisateur UtilisateurData) {
		
		Optional<Utilisateur> existingUtilisateur = utilisateurService.getUtilisateurById(utilisateurId);
		
		if (existingUtilisateur.isPresent()) {
			Utilisateur Utilisateur = existingUtilisateur.get();
			Utilisateur.setNom(UtilisateurData.getNom());
			Utilisateur.setEmail(UtilisateurData.getEmail());
			Utilisateur.setRole(UtilisateurData.getRole());
			utilisateurService.saveUtilisateur(Utilisateur);
			
			modelMap.addAttribute("Utilisateur", Utilisateur);
		}
		
		return String.format("redirect:/utilisateur/%d", utilisateurId);
	}
	
	
	@GetMapping("/utilisateur/create")
	public String createGetUtilisateur(ModelMap modelMap) {
		Utilisateur utilisateur = new Utilisateur();
		modelMap.addAttribute("utilisateur", utilisateur);
		modelMap.addAttribute("pageTitle", "Ajouter un nouveau utilisateur");
		return "utilisateur";
	}
	
	
	@PostMapping("/utilisateur/create")
	public String createUtilisateur(ModelMap modelMap, @ModelAttribute Utilisateur utilisateurData) {
		Utilisateur utilisateur = utilisateurService.saveUtilisateur(utilisateurData);
		modelMap.addAttribute("sale", utilisateur);
		List<Utilisateur> utilisateurs = utilisateurService.getAllUtilisateurs();
		modelMap.addAttribute("utilisateurs", utilisateurs);
		return "redirect:/utilisateurs";
	}
	
	@PostMapping("utilisateurs/search")
	public String searchUtilisateurByNomOrEmail(ModelMap modelMap,@RequestParam("nom") String nom) {
		List<Utilisateur> utilisateurs = utilisateurService.findByNom(nom, nom);
		modelMap.addAttribute("utilisateurs", utilisateurs);
		return "utilisateurs";
	}

}
