package com.smas_lab.gestionreservation.services;

import java.util.List;
import java.util.Optional;

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
	
	public Optional<Utilisateur> getUtilisateurById(Long id){
		return utilisateurRepo.findById(id);
	}

	public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
		return utilisateurRepo.save(utilisateur);
	}
	
	public List<Utilisateur> findByNom(String nom, String email){
		return utilisateurRepo.findByNomOrEmailContainingIgnoreCase(nom, email);
	}
	
	public void deleteUtilisateur(Utilisateur utilisateur) {
		utilisateurRepo.delete(utilisateur);
	}
}
