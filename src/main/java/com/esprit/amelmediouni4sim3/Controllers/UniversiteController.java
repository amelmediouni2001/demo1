package com.esprit.amelmediouni4sim3.Controllers;

import com.esprit.amelmediouni4sim3.Services.IChambreServices;
import com.esprit.amelmediouni4sim3.Services.IUnivesiteServices;
import com.esprit.amelmediouni4sim3.entities.Universite;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/universite")
public class UniversiteController {
    private final IUnivesiteServices univesiteServices;
    private final IChambreServices iChambreServices;
    private final IUnivesiteServices iUnivesiteServices;


}
