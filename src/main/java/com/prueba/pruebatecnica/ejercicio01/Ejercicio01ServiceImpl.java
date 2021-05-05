package com.prueba.pruebatecnica.ejercicio01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ejercicio01ServiceImpl implements Ejercicio01Service{

    private Ejercicio01 ejercicio01;

    @Autowired
    public Ejercicio01ServiceImpl(Ejercicio01 ejercicio01) {
        this.ejercicio01 = ejercicio01;
    }



    @Override
    public String anagrams(String a, String b) {
        // TODO Auto-generated method stub
        return this.ejercicio01.anagrams(a, b);
    }
    
}
