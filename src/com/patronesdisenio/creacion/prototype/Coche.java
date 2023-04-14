package com.patronesdisenio.creacion.prototype;

public class Coche {

    public String marca;
    public String modelo;
    int puertas;


    public Coche(){

    }
    public Coche clonar(){
        Coche coche = new Coche();
        coche.marca = this.marca;
        coche.modelo = this.modelo;
        coche.puertas = this.puertas;
        return coche;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", puertas=" + puertas +
                '}';
    }
}
