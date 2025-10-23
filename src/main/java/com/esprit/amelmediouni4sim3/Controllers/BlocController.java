package com.esprit.amelmediouni4sim3.Controllers;

import com.esprit.amelmediouni4sim3.Services.IBlocServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/bloc")

public class BlocController {
    private final IBlocServices blocServices;

}
