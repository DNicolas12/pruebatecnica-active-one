package com.prueba.pruebatecnica.ejercicio03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ejercicio03ServiceImpl implements Ejercicio03Service{
    
    private Ejercicio03 ejercicio03;

    @Autowired
    public Ejercicio03ServiceImpl(Ejercicio03 ejercicio03) {
        this.ejercicio03 = ejercicio03;
    }

    @Override
    public String cantidadManzanasNaranjas(int s, int t, int a, int b, int m, int n, int[] manzanas, int[] naranjas) {
        // TODO Auto-generated method stub
        return this.ejercicio03.cantidadManzanasNaranjas(s, t, a, b, m, n, manzanas, naranjas);
    }


}
