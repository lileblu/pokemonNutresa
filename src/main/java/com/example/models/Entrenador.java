package com.example.models;

import java.util.UUID;

public class Entrenador {

    private  UUID id;
    private  String nombre;
    private  String ciudadOrigen;
    private  Integer edad;


    public Entrenador () {

    }


    public Entrenador(UUID id, String nombre, String ciudadOrigen, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.ciudadOrigen = ciudadOrigen;
        this.edad = edad;
    }


    public UUID getId() {
        return id;
    }


    public void setId(UUID id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCiudadOrigen() {
        return ciudadOrigen;
    }


    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }


    public Integer getEdad() {
        return edad;
    }


    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    

}
