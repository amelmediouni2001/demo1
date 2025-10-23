package com.esprit.amelmediouni4sim3.Controllers;


import com.esprit.amelmediouni4sim3.Services.IChambreServices;
import com.esprit.amelmediouni4sim3.entities.Chambre;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/chambre")

public class ChambreController {
    private final IChambreServices chambreServices;

    @PostMapping
    public Chambre chambre(@RequestBody Chambre chambre) {
        return chambreServices.addChambre(chambre);
    }

    @PutMapping()
    public Chambre updateChambre(@RequestBody Chambre chambre) {
        return chambreServices.updateChambre(chambre);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteChambre(@PathVariable Long id) {
        chambreServices.deleteChambre(id);
    }

    @GetMapping("/getChambreById/{id}")
    public Chambre getChambreById(@PathVariable Long id) {
        return chambreServices.getChambreById(id);
    }

    @GetMapping()
    public List<Chambre> getAllChambre() {
        return chambreServices.findAll();
    }

}
