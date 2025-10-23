package com.esprit.amelmediouni4sim3.Controllers;

import com.esprit.amelmediouni4sim3.Services.IEtudiantServices;
import com.esprit.amelmediouni4sim3.entities.Etudiant;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/etudiant")
public class EtudiantController {
    private final IEtudiantServices etudiantServices;

    @PostMapping()
    public Etudiant etudiant(@RequestBody Etudiant etudiant) {return etudiantServices.addEtudiant(etudiant);}

    @PutMapping()
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {return etudiantServices.updateEtudiant(etudiant);}
}
