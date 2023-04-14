package com.patronesdisenio.comportamiento.observer;

public class Main {
    public static void main(String[] args) {
        Emisora emisora = new Emisora();


        //Suscribe a emisora
        emisora.meteReceptor(new ReceptorRadio());
        emisora.meteReceptor(new ReceptorTV());
        emisora.meteReceptor(new ReceptorSatelite());

        emisora.emite();

    }
}
