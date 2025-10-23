package com.esprit.amelmediouni4sim3.Repositories;

import com.esprit.amelmediouni4sim3.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}
