package com.esprit.amelmediouni4sim3.Controllers;

import com.esprit.amelmediouni4sim3.Services.IChambreServices;
import com.esprit.amelmediouni4sim3.Services.IUnivesiteServices;
import com.esprit.amelmediouni4sim3.entities.Universite;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/universite")
public class UniversiteController {
    private final IUnivesiteServices univesiteServices;


    @PostMapping()
    public Universite addUniversite(@RequestBody Universite universite) {return univesiteServices.addUniversite(universite);}

    @PutMapping()
    public Universite updateUniversite(@RequestBody Universite universite) {return univesiteServices.updateUniversite(universite);}

    @DeleteMapping("/delete/{id}")
    public void deleteUniversite(@PathVariable Long id) { univesiteServices.deleteUniversite(id); }

    @GetMapping("/getUniversiteById/{id}")
    public Universite getUniversiteById(@PathVariable Long id) {return univesiteServices.getUniversiteById(id);}

    @GetMapping()
    public List<Universite> getAllUniversites() {return univesiteServices.getAllUniversites();}




}
