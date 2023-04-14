package com.patronesdisenio.creacion.builder;

public class Vehiculo {
    public String marca;
    public String tipo;
    public String motor;
    public int puerts;

    public String getMarca() {
        return marca;
    }


    public String getTipo() {
        return tipo;
    }


    public String getMotor() {
        return motor;
    }

    public int getPuerts() {
        return puerts;
    }



    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", motor='" + motor + '\'' +
                ", puerts=" + puerts +
                '}';
    }
}
