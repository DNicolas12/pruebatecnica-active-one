package com.prueba.pruebatecnica.ejercicio01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ejercicio01")
public class Ejercicio01RESTController {
    
    private Ejercicio01Service ejercicio01Service;

    @Autowired
    public Ejercicio01RESTController(Ejercicio01Service ejercicio01Service) {
        this.ejercicio01Service = ejercicio01Service;
    }

    @GetMapping
    public ResponseEntity<String> anagrams(@RequestParam String a, @RequestParam String b){
        return ResponseEntity.ok().body(this.ejercicio01Service.anagrams(a, b));
    }

}
