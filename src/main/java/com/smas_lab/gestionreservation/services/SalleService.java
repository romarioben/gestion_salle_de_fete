package com.smas_lab.gestionreservation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smas_lab.gestionreservation.models.Salle;
import com.smas_lab.gestionreservation.repositories.SalleRepository;

@Service
public class SalleService {
	
	@Autowired
	private SalleRepository salleRepo;
	
	public List<Salle> getAllSalles(){
		return salleRepo.findAll();
	}
	
	public Optional<Salle> getSalleById(Long id) {
		return salleRepo.findById(id);
	}
	
	public Salle saveSalle(Salle salle) {
		return salleRepo.save(salle);
	}
	
	public List<Salle> findByNom(String nom){
		return salleRepo.findByNomContainingIgnoreCase(nom);
	}
	
	public void deleteSalle(Salle salle) {
		salleRepo.delete(salle);
	}
}
