package com.esprit.amelmediouni4sim3.Services;

import com.esprit.amelmediouni4sim3.Repositories.UniversiteRepository;
import com.esprit.amelmediouni4sim3.entities.Foyer;
import com.esprit.amelmediouni4sim3.entities.Universite;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
@AllArgsConstructor

public class IUnivesiteServicesImp implements IUnivesiteServices {

    private final UniversiteRepository universiteRepository;
    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteUniversite(Universite universite) {
        universiteRepository.delete(universite);
    }

    @Override
    public List<Universite> getAllUniversites() {return universiteRepository.findAll(); }

    @Override
    public Universite getUniversite(Long id) {
        return universiteRepository.findById(id).orElse(null);
    }


}
