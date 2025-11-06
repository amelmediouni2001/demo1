package com.esprit.amelmediouni4sim3.Services;


import com.esprit.amelmediouni4sim3.entities.Foyer;

import java.util.List;

public interface IFoyerServices {
    Foyer addFoyer(Foyer foyer);

    Foyer getFoyerById(Long id);

    Foyer updateFoyer(Foyer foyer);

    void deleteFoyer(Long id);

    List<Foyer> getAllFoyer();
}