package com.patronesdisenio.comportamiento.observer;

/**
 * Observa muchos objetos y les emite una respuesta de forma conjunta
 */
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
