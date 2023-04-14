package com.patronesdisenio.estructura.decorador;

public class TelefonoNextGen extends TelefonoDecorator{

    public TelefonoNextGen(Telefono telefono) {
        super(telefono);
    }

    @Override
    public void create(){
        super.create();
        System.out.println(" -> Telefono nextGe: Tengo tambine 5G");
        System.out.println(" -> Telefono nextGe: Tengo tambine VoLTE");
    }
}
