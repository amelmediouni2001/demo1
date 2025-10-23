package com.esprit.amelmediouni4sim3.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reservation {
    @Id
    private String idReservation;

    private LocalDate anneeUniversitaire;
    private boolean estValide;

    @ManyToMany
    List<Etudiant> etudiants ;
}