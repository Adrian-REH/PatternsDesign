package com.patronesdisenio.estructura.adapter;

public class Lampara implements Enchufable{

    boolean encendido = false;
    @Override
    public void enciende() {
        encendido=true;

        System.out.println("La lampara esta encendida");
    }

    @Override
    public void apaga() {
        encendido=false;

        System.out.println("La lampara esta apagada");
    }

    @Override
    public boolean estaEncendido() {
        return encendido;
    }
}
