package com.patronesdisenio.estructura.decorador;

public class TelefonoDecorator  implements Telefono{

    private Telefono telefono;

    public TelefonoDecorator(Telefono telefono){
        this.telefono = telefono;
    }
    @Override
    public void create(){
        this.telefono.create();
    }



}
