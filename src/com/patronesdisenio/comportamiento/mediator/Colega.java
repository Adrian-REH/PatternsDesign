package com.patronesdisenio.comportamiento.mediator;

abstract public class Colega {
    public Mediator mediator;

    public Colega(){
        System.out.println("Soy un constructor de colega");

    }
    public void setMediator(Mediator mediator){
        this.mediator=mediator;
    }
    abstract void recibe();
    abstract void envia();
}
