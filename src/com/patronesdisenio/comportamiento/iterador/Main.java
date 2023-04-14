package com.patronesdisenio.comportamiento.iterador;

public class Main {

    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        usuarios.crear( new Usuario("uno",4) );
        usuarios.crear( new Usuario("dos",14) );
        usuarios.crear( new Usuario("tres",20) );

        while (usuarios.hayMas()) {
            Usuario usuario = usuarios.siguiente();
            System.out.println("Usuario " + usuario.getNombre());
        }
        usuarios.reinicia();
        usuarios.crear( new Usuario("cuatro",18) );
        Usuario usuario = usuarios.siguiente();
        System.out.println("Usuario " + usuario.getNombre());
    }
}
