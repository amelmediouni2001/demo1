package com.esprit.amelmediouni4sim3.Controllers;

import com.esprit.amelmediouni4sim3.Services.IBlocServices;
import com.esprit.amelmediouni4sim3.entities.Bloc;
import com.esprit.amelmediouni4sim3.entities.Etudiant;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/bloc")

public class BlocController {
    private final IBlocServices blocServices;


    @PostMapping()
    public Bloc bloc(@RequestBody Bloc bloc) {return blocServices.addBloc(bloc);}

    @PutMapping()
    public Bloc updateBloc(@RequestBody Bloc bloc) {return blocServices.updateBloc(bloc);}


    @DeleteMapping("/delete/{id}")
    public void deleteBlocById(@PathVariable Long id) {
        blocServices.deleteBloc(id);
    }

    @GetMapping("/getEtudiantById/{id}")
    public Bloc getBlocById(@PathVariable Long id) {
        return blocServices.getBlocById(id);
    }

    @GetMapping()
    public List<Bloc> getAllBloc() {
        return blocServices.getAllBloc();
    }

}