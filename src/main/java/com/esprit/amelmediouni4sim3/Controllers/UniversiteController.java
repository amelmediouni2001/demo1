package com.esprit.amelmediouni4sim3.Controllers;

import com.esprit.amelmediouni4sim3.Services.IUnivesiteServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/universite")
public class UniversiteController {
    private final IUnivesiteServices univesiteServices;
}
