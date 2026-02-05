package com.smas_lab.gestionreservation.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smas_lab.gestionreservation.models.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
	public List<Utilisateur> findByNomOrEmailContainingIgnoreCase(String nom, String email);
}
