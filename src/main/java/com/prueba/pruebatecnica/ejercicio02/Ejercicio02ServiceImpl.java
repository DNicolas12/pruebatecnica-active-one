package com.prueba.pruebatecnica.ejercicio02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ejercicio02ServiceImpl implements Ejercicio02Service{

    private Ejercicio02 ejercicio02;

    @Autowired
    public Ejercicio02ServiceImpl(Ejercicio02 ejercicio02) {
        this.ejercicio02 = ejercicio02;
    }


    @Override
    public String absoluteDiference(int[][] pMatriz) {
        // TODO Auto-generated method stub
        return this.ejercicio02.absoluteDiference(pMatriz);
    }
    
}
