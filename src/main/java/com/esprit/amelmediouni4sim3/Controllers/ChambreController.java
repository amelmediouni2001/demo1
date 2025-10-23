package com.esprit.amelmediouni4sim3.Controllers;


import com.esprit.amelmediouni4sim3.Services.IChambreServices;
import com.esprit.amelmediouni4sim3.entities.Chambre;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/chambre")

public class ChambreController {
    private final IChambreServices chambreServices;

    @PostMapping
    public Chambre chambre(@RequestBody Chambre chambre) {
        return chambreServices.addChambre(chambre);
    }

}
