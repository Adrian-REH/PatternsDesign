package com.patronesdisenio.comportamiento.observer;

public class ReceptorRadio implements Receptor{
    @Override
    public void recibe() {
        System.out.println("Señal recibida en radio");

    }
}
