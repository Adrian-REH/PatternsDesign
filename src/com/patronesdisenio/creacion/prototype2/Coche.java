package com.patronesdisenio.creacion.prototype2;

public class Coche implements Cloneable{

    public String marca;
    public String modelo;
    int puertas;


    public Coche(){

    }
    public Coche clonar() throws CloneNotSupportedException {
        return (Coche)this.clone();
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
