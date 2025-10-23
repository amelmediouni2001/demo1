package com.esprit.amelmediouni4sim3.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idChambre;
    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;



    @ManyToOne
    Bloc blocs ;
    @OneToMany
    Set<Reservation> reservation;


}