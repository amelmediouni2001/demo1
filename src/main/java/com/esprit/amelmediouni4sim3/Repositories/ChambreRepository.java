package com.esprit.amelmediouni4sim3.Repositories;

import com.esprit.amelmediouni4sim3.entities.Chambre;
import jakarta.persistence.OneToMany;
import org.springframework.data.domain.Limit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    // use JpaRepository's built-in deleteById(Long id)

    List<Chambre> findByBlocsNomBloc(String blocsNomBloc, Limit limit);
}
