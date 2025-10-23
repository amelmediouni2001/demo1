package com.esprit.amelmediouni4sim3.Controllers;

import com.esprit.amelmediouni4sim3.Services.IEtudiantServices;
import com.esprit.amelmediouni4sim3.entities.Chambre;
import com.esprit.amelmediouni4sim3.entities.Etudiant;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/etudiant")
public class EtudiantController {
    private final IEtudiantServices etudiantServices;

    @PostMapping()
    public Etudiant etudiant(@RequestBody Etudiant etudiant) {return etudiantServices.addEtudiant(etudiant);}

    @PutMapping()
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {return etudiantServices.updateEtudiant(etudiant);}



    @DeleteMapping("/delete/{id}")
    public void deleteEtudiantById(@PathVariable Long id) {
        etudiantServices.deleteEtudiant(id);
    }

    @GetMapping("/getEtudiantById/{id}")
    public Etudiant getEtudiantById(@PathVariable Long id) {
        return etudiantServices.getEtudiantById(id);
    }

    @GetMapping()
    public List<Etudiant> geAllEtudiant() {
        return etudiantServices.getAllEtudiant();
    }

}
