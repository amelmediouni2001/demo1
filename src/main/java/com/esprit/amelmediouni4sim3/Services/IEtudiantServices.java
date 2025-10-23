package com.esprit.amelmediouni4sim3.Services;


import com.esprit.amelmediouni4sim3.entities.Etudiant;

import java.util.List;

public interface IEtudiantServices {
    Etudiant addEtudiant(Etudiant etudiant);
    Etudiant getEtudiantById(Long id);
    Etudiant updateEtudiant(Etudiant etudiant);
    void deleteEtudiant(Long id);
    List<Etudiant> getAllEtudiant();
}
