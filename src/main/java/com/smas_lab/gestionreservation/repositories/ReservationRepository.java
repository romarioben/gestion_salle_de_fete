package com.smas_lab.gestionreservation.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smas_lab.gestionreservation.models.Reservation;
import com.smas_lab.gestionreservation.models.Salle;
import com.smas_lab.gestionreservation.models.Utilisateur;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
	List<Reservation> findBySalle(Salle salle);
	List<Reservation> findByUtilisateur(Utilisateur utilisateur);
	
	List<Reservation> findBySalleAndUtilisateur(Salle salle, Utilisateur utilisateur);

}
