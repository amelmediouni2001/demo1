package com.esprit.amelmediouni4sim3.Repositories;

import com.esprit.amelmediouni4sim3.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    // use JpaRepository's built-in deleteById(Long id)
}
