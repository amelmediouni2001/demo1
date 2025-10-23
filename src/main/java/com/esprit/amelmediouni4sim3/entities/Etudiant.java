package com.esprit.amelmediouni4sim3.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idEtudiant;

    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    private LocalDate dateNaissance;
    @ManyToMany(mappedBy = "etudiants")
    List<Reservation> reservations;

}