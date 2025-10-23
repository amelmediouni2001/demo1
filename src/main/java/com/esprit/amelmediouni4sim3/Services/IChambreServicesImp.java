package com.esprit.amelmediouni4sim3.Services;

import com.esprit.amelmediouni4sim3.Repositories.ChambreRepository;
import com.esprit.amelmediouni4sim3.entities.Chambre;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
@AllArgsConstructor
public  class IChambreServicesImp implements IChambreServices {


    private final ChambreRepository chambreRepository;


    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
        public Chambre getChambreById(Long id) {
            return chambreRepository.findById(id).orElse(null);
        }


    @Override
    public void deleteChambre(Long id) {
        chambreRepository.deleteById(id);

    }

    @Override
    public List<Chambre> findAll() {
        return chambreRepository.findAll();
    }
}
