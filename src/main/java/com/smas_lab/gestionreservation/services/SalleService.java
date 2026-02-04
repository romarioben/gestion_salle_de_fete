package com.smas_lab.gestionreservation.services;

import java.util.List;

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
}
