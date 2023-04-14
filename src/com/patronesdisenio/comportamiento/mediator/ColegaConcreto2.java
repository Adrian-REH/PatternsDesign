package com.patronesdisenio.comportamiento.mediator;

public class ColegaConcreto2 extends Colega {
    @Override
    void recibe() {
        System.out.println("He recibido un mensaje: CC2");

    }

    @Override
    void envia() {
        System.out.println("He enviado un mensaje: CC2");
        mediator.reenvia(this);

    }
}
