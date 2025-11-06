package com.esprit.amelmediouni4sim3.Controllers;

import com.esprit.amelmediouni4sim3.Services.IFoyerServices;
import com.esprit.amelmediouni4sim3.entities.Etudiant;
import com.esprit.amelmediouni4sim3.entities.Foyer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/foyer")
public class FoyerController {
    private final IFoyerServices foyerServices;

    @PostMapping()
    public Foyer foyer(@RequestBody Foyer foyer) {return foyerServices.addFoyer(foyer);}

    @PutMapping()
    public Foyer updateFoyer(@RequestBody Foyer foyer) {return foyerServices.updateFoyer(foyer);}


    @DeleteMapping("/delete/{id}")
    public void deleteFoyerById(@PathVariable Long id) {
        foyerServices.deleteFoyer(id);
    }

    @GetMapping("/getEtudiantById/{id}")
    public Foyer getFoyerById(@PathVariable Long id) {
        return foyerServices.getFoyerById(id);
    }

    @GetMapping()
    public List<Foyer> getAllFoyer() {
        return foyerServices.getAllFoyer();
    }



}
