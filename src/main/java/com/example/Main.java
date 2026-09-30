package com.example;

import com.example.models.Entrenador;
import com.example.models.Pokemon;

public class Main {
    public static void main(String[] args) {
        
        Pokemon objeto = new Pokemon();
        Entrenador objetoDos = new Entrenador();
        Auxiliar objetoTres = new Auxiliar();



        System.out.println(objeto);
        System.out.println(objetoDos);
        System.out.println(objetoTres.nombre);

    }
}