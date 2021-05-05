package com.prueba.pruebatecnica.ejercicio03;

public class Ejercicio03 {
    

    public int[] calcularDistanciaManzanas(int[] position, int a, int m){
        int[] resultado = new int[m];
        for(int i = 0; i<position.length; i++){
            position[i] = position[i] + a;
        }
        resultado = position;
        return resultado;
    }

    public int[] calcularDistanciaNaranjas(int[] position, int b, int n){
        int[] resultado = new int[n];
        for(int i = 0; i<position.length; i++){
            position[i] = position[i] + b;
        }
        resultado = position;
        return resultado;
    }
    public String cantidadManzanasNaranjas(int s, int t, int a, int b, int m, int n, int[] manzanas, int[] naranjas){

        String resultado = "";

        int[] distanciaManzanas = calcularDistanciaManzanas(manzanas, a, m);

        int countManzanas = 0;
        for(int i = 0; i<distanciaManzanas.length; i++){
            int distancia = distanciaManzanas[i];

            if(distancia >= s && distancia <= t){
                countManzanas++;
            }
        }

        int[] distanciaNaranjas = calcularDistanciaNaranjas(naranjas, b, n);

        int countNaranjas = 0;
        for(int i = 0; i<distanciaNaranjas.length; i++){
            int distancia = distanciaNaranjas[i];

            if(distancia >= s && distancia <= t){
                countNaranjas++;
            }
        }

        resultado = "Manzanas: " + countManzanas + " \n" + "Naranjas: " + countNaranjas;

        return resultado;

    }


}
