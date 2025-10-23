package com.esprit.amelmediouni4sim3.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)


public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;

    @OneToOne
    Universite universite ;
    @OneToMany(mappedBy = "foyer")
    List<Bloc> blocs; ;
}
