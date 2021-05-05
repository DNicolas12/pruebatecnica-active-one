package com.prueba.pruebatecnica.ejercicio02;

public class Ejercicio02 {

    private int[][] matriz = new int[3][3];

    public void llenarMatriz(){
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        matriz[2][0] = 9;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

    }

    public String sumandoMatrizRight(int[][] pMatriz){
        String mostrar = "";
        int resultado = 0;
        for(int i = 0; i<pMatriz.length; i++){
            int j = ((pMatriz.length -1) - i);
            resultado += pMatriz[i][j];
            mostrar = String.valueOf(resultado);
        }
        return mostrar;
    }

    public String sumandoMatrizLeft(int[][] pMatriz){
        String mostrar = "";
        int resultado = 0;
        for(int i = 0; i<pMatriz.length; i++){
            resultado += pMatriz[i][i];
            mostrar = String.valueOf(resultado);
        }
        return mostrar;
    }
    
    public String absoluteDiference(int[][] pMatriz){
        String resultado = "";

        int absolute = Math.abs(Integer.parseInt(sumandoMatrizLeft(pMatriz)) - Integer.parseInt(sumandoMatrizRight(pMatriz)));

        resultado = "Left-to-Right diagonal = " + sumandoMatrizLeft(pMatriz) + " \n" + "Right to left diagonal = " + sumandoMatrizRight(pMatriz) + " \n" + "Absolute difference is: " + String.valueOf(absolute);

        return resultado;
    }
    
}
