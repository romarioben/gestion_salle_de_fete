package com.smas_lab.gestionreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smas_lab.gestionreservation.models.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
