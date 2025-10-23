package com.esprit.amelmediouni4sim3.Services;


import com.esprit.amelmediouni4sim3.entities.Foyer;

import java.util.List;

public interface IFoyerServices {
    Foyer addFoyer(Foyer foyer);
    Foyer updateFoyer(Foyer foyer);
    void deleteFoyer(Foyer foyer);
    List<Foyer> getAllFoyers();
    Foyer getFoyer(int id);
}
