package com.smas_lab.gestionreservation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smas_lab.gestionreservation.models.Utilisateur;
import com.smas_lab.gestionreservation.repositories.UtilisateurRepository;

@Service
public class UtilisateurService {
	
	@Autowired
	private UtilisateurRepository utilisateurRepo;
	
	public List<Utilisateur> getAllUtilisateurs(){
		return utilisateurRepo.findAll();
	}
}
