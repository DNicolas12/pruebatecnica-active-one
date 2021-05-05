package com.prueba.pruebatecnica.ejercicio02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ejercicio02")
public class Ejercicio02RESTController {
    
    private Ejercicio02Service ejercicio02Service;

    @Autowired
    public Ejercicio02RESTController(Ejercicio02Service ejercicio02Service) {
        this.ejercicio02Service = ejercicio02Service;
    }

    @GetMapping("/absolute-diference")
    public ResponseEntity<String> absoluteDiference(@RequestParam int[][] paramValues){
        return ResponseEntity.ok().body(this.ejercicio02Service.absoluteDiference(paramValues));
    }


}
