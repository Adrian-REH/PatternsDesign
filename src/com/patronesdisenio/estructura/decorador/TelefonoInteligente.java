package com.patronesdisenio.estructura.decorador;

public class TelefonoInteligente extends TelefonoDecorator{

    public TelefonoInteligente(Telefono telefono) {
        super(telefono);
    }

    @Override
    public void create(){
        super.create();
        System.out.println(" -> Telefono Inteligente: Tengo tambine 4G");
    }
}
