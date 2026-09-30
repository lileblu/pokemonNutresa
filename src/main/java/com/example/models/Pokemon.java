package com.example.models;

import java.util.UUID;

public class Pokemon {

    private  UUID id;
    private  String nombre;
    private  Integer cantidaddeVida; 
    private  Integer cantidadDefensa;
    private  Integer cantidadAtaque;
    private  String tipo;

    
    public Pokemon() {
    }


    public Pokemon(UUID id, String nombre, Integer cantidaddeVida, Integer cantidadDefensa, Integer cantidadAtaque,
            String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.cantidaddeVida = cantidaddeVida;
        this.cantidadDefensa = cantidadDefensa;
        this.cantidadAtaque = cantidadAtaque;
        this.tipo = tipo;
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


    public Integer getCantidaddeVida() {
        return cantidaddeVida;
    }


    public void setCantidaddeVida(Integer cantidaddeVida) {
        this.cantidaddeVida = cantidaddeVida;
    }


    public Integer getCantidadDefensa() {
        return cantidadDefensa;
    }


    public void setCantidadDefensa(Integer cantidadDefensa) {
        this.cantidadDefensa = cantidadDefensa;
    }


    public Integer getCantidadAtaque() {
        return cantidadAtaque;
    }


    public void setCantidadAtaque(Integer cantidadAtaque) {
        this.cantidadAtaque = cantidadAtaque;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    

}
