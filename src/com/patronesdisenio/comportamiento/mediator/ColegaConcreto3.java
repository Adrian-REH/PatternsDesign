package com.patronesdisenio.comportamiento.mediator;

public class ColegaConcreto3 extends Colega {
    @Override
    void recibe() {
        System.out.println("He recibido un mensaje: CC3");

    }

    @Override
    void envia() {
        System.out.println("He enviado un mensaje: CC3");
        mediator.reenvia(this);

    }
}
