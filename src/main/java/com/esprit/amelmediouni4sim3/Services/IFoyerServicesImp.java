package com.esprit.amelmediouni4sim3.Services;

import com.esprit.amelmediouni4sim3.Repositories.FoyerRepository;
import com.esprit.amelmediouni4sim3.entities.Foyer;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
@AllArgsConstructor

public class IFoyerServicesImp implements IFoyerServices {

    private final FoyerRepository foyerRepository;
    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void deleteFoyer(Foyer foyer) {
        foyerRepository.delete(foyer);
    }

    @Override
    public List<Foyer> getAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer getFoyer(int id) {
        return foyerRepository.findById((long) id).get();
    }
}
