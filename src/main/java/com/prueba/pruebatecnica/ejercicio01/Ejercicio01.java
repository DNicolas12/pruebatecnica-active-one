package com.prueba.pruebatecnica.ejercicio01;

public class Ejercicio01 {


    public String anagrams(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();
        int count = 0;
        String resultado = "Not Anagrams";
        if(a.length() == b.length()){
            for(int i = 0; i<a.length(); i++){
                char letter = a.charAt(i);
                if(b.contains(String.valueOf(letter))){
                    count++;
        
                }
            }
            if(count == a.length()){
                resultado  = "Anagrams";
            }else{
                resultado = "Not Anagrams";
            }
        } 
        return resultado;
    }
    
}
