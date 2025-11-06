package com.esprit.amelmediouni4sim3.Services;


import com.esprit.amelmediouni4sim3.entities.Foyer;
import com.esprit.amelmediouni4sim3.entities.Universite;

import java.util.List;

public interface IUnivesiteServices {
    Universite addUniversite(Universite universite);
    Universite getUniversiteById(Long id);
    Universite updateUniversite(Universite universite);
    void deleteUniversite(Long id);

    void deleteUniversite(Universite universite);

    List<Universite> getAllUniversites();

    Universite getUniversite(Long id);
}
