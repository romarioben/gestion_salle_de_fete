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


import com.smas_lab.gestionreservation.models.Reservation;
import com.smas_lab.gestionreservation.models.Salle;
import com.smas_lab.gestionreservation.models.Utilisateur;
import com.smas_lab.gestionreservation.services.ReservationService;
import com.smas_lab.gestionreservation.services.SalleService;
import com.smas_lab.gestionreservation.services.UtilisateurService;

@Controller
public class WebReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@Autowired
	private SalleService salleServie;
	
	@Autowired
	private UtilisateurService utilisateurService;
	
	@GetMapping("/reservations")
	public String getAllReservations(ModelMap modelMap) {
		List<Reservation> reservations = reservationService.getAllReservations();
		modelMap.addAttribute("reservations", reservations);
		return "reservations";
	}
	
	@GetMapping("/reservation/create")
	public String createGetReservation(ModelMap modelMap) {
		List<Salle> salles = salleServie.getAllSalles();
		List<Utilisateur> utilisateurs = utilisateurService.getAllUtilisateurs();
		Reservation reservation = new Reservation();
		
		modelMap.addAttribute("utilisateurs", utilisateurs);
		modelMap.addAttribute("salles", salles);
		modelMap.addAttribute("reservation", reservation);
		modelMap.addAttribute("pageTitle", "Ajouter une nouvelle réservation");
		return "reservation";
	}
	
	@PostMapping("/reservation/create")
	public String createPostReservation(@ModelAttribute Reservation reservationData, ModelMap modelMap) {
		reservationService.saveReservation(reservationData);
		List<Reservation> reservations = reservationService.getAllReservations();
		modelMap.addAttribute("reservations", reservations);
		return "reservations";
	}
	
	@GetMapping("/reservation/{id}")
	public String getReservation(@PathVariable("id") Long id, ModelMap modelMap) {
		Optional<Reservation> existingReservation = reservationService.getReservationById(id);
		if (existingReservation.isPresent()) {
			Reservation reservation = existingReservation.get();
			modelMap.addAttribute("reservation", reservation);
		}
		List<Salle> salles = salleServie.getAllSalles();
		List<Utilisateur> utilisateurs = utilisateurService.getAllUtilisateurs();
		
		modelMap.addAttribute("utilisateurs", utilisateurs);
		modelMap.addAttribute("salles", salles);
		modelMap.addAttribute("pageTitle", String.format("Mettre à jour la réservation"));
		return "reservation";
	}
	
	@PostMapping("/reservation/{id}")
	public String editReservation(ModelMap modelMap, @PathVariable("id") Long id, @ModelAttribute Reservation reservationData) {
		Optional<Reservation> existingReservation = reservationService.getReservationById(id);
		if (existingReservation.isPresent()) {
			Reservation reservation = existingReservation.get();
			reservation.setDateReservation(reservationData.getDateReservation());
			reservation.setUtilisateur(reservationData.getUtilisateur());
			reservation.setSalle(reservationData.getSalle());
			reservation.setHeureDebut(reservationData.getHeureDebut());
			reservation.setHeureFin(reservationData.getHeureFin());
			reservationService.saveReservation(reservation);
			modelMap.addAttribute("reservation", reservation);
		}
		return "reservation";
	}
	
	
	@GetMapping("/reservation/delete/{id}")
	public String deleteReservation(ModelMap modelMap, @PathVariable("id") Long id) {
		Optional<Reservation> existingReservation = reservationService.getReservationById(id);
		if (existingReservation.isPresent()) {
			Reservation reservation = existingReservation.get();
			reservationService.deleteReservation(reservation);
			modelMap.addAttribute("reservation", reservation);
		}
		List<Reservation> reservations = reservationService.getAllReservations();
		modelMap.addAttribute("reservations", reservations);
		return "reservations";
	}
}
