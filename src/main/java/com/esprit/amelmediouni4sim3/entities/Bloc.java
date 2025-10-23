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

public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;

    @ManyToOne()
    Foyer foyer;
    @OneToMany(mappedBy = "blocs")
    Set<Chambre> Chambre;

}