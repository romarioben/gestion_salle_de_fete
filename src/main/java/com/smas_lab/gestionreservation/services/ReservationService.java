package com.smas_lab.gestionreservation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smas_lab.gestionreservation.models.Reservation;
import com.smas_lab.gestionreservation.models.Salle;
import com.smas_lab.gestionreservation.models.Utilisateur;
import com.smas_lab.gestionreservation.repositories.ReservationRepository;

@Service
public class ReservationService {
	
	@Autowired
	private ReservationRepository reservationRepo;
	
	public List<Reservation> getAllReservations(){
		return reservationRepo.findAll();
	}
	
	public Optional<Reservation> getReservationById(Long id){
		return reservationRepo.findById(id);
	}
	
	public Reservation saveReservation(Reservation reservationData) {
		return reservationRepo.save(reservationData);
	}
	
	public void deleteReservation(Reservation reservation) {
		reservationRepo.delete(reservation);
	}
	
	public List<Reservation> findBySalle(Salle salle){
		return reservationRepo.findBySalle(salle);
	}
	
	public List<Reservation> findByUtilisateur(Utilisateur utilisateur){
		return reservationRepo.findByUtilisateur(utilisateur);
	}
	
	public List<Reservation> findBySalleAndUtilisateur(Salle salle, Utilisateur utilisateur){
		return reservationRepo.findBySalleAndUtilisateur(salle, utilisateur);
	}
}
