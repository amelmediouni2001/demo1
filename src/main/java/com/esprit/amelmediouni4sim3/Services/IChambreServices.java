package com.esprit.amelmediouni4sim3.Services;


import com.esprit.amelmediouni4sim3.entities.Chambre;

import java.util.List;

public interface IChambreServices {
    Chambre addChambre(Chambre chambre);
    Chambre getChambreById(Long id);
    Chambre updateChambre(Chambre chambre);
    void deleteChambre(Long id);
    List<Chambre> getAllChambre();

    List<Chambre> findAllChambre();
}
