package com.laupicero.wordsrandomnizathor.POJOS;

public class Palabra {
    private String nombre;
    private String tipo;

    //Constructores
    public Palabra(){}

    public Palabra(String nombre){
        this.nombre = nombre;
        this.tipo = "indefinido";
    }


    public Palabra(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }

    //SETTER Y GETTER
    public String getNombre(){return this.nombre;}
    public String getTipo(){return this.tipo;}

    public void setNombre(String nombre){this.nombre = nombre;}
    public void setTipo(String tipo){this.tipo = tipo;}

}
