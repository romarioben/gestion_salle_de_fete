package com.smas_lab.gestionreservation.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smas_lab.gestionreservation.models.Salle;

public interface SalleRepository extends JpaRepository<Salle, Long> {
	public List<Salle> findByNomContainingIgnoreCase(String nom);
}
