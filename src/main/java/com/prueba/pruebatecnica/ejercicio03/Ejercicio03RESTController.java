package com.prueba.pruebatecnica.ejercicio03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ejercicio03")
public class Ejercicio03RESTController {

    private Ejercicio03Service ejercicio03Service;

    @Autowired
    public Ejercicio03RESTController(Ejercicio03Service ejercicio03Service) {
        this.ejercicio03Service = ejercicio03Service;
    }

    @GetMapping
    public ResponseEntity<String> cantidadManzanasNaranjas(@RequestParam int s, @RequestParam int t, @RequestParam int a, @RequestParam int b, @RequestParam int m, @RequestParam int n, @RequestParam int[] manzanas, @RequestParam int[] naranjas){
        return ResponseEntity.ok().body(this.ejercicio03Service.cantidadManzanasNaranjas(s, t, a, b, m, n, manzanas, naranjas));
    }
    
}
