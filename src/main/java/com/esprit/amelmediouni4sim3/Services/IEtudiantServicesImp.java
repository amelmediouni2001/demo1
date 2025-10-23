package com.esprit.amelmediouni4sim3.Services;

import com.esprit.amelmediouni4sim3.Repositories.EtudiantRepository;
import com.esprit.amelmediouni4sim3.entities.Etudiant;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
@AllArgsConstructor

public class IEtudiantServicesImp implements IEtudiantServices {

    private final EtudiantRepository etudiantRepository;
    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant getEtudiantById(int id) {
        return etudiantRepository.findById((long) id).orElse(null);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiant(Etudiant etudiant) {
etudiantRepository.delete(etudiant);
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }
}
