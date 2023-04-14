package com.patronesdisenio.comportamiento.mediator;

public class ColegaConcreto1 extends Colega {


    public ColegaConcreto1() {

        System.out.println("Soy un constructor de colega concreto 1");
    }
    @Override
    void recibe() {
        System.out.println("He recibido un mensaje: CC1");
    }

    @Override
    void envia() {
        System.out.println("He enviado un mensaje: CC1");
        mediator.reenvia(this);
    }
}
