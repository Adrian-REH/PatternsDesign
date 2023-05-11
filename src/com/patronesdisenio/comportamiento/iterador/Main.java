package com.patronesdisenio.comportamiento.iterador;

/**
 * Comportamiento lleno una bolsa de objetos para
 * luego gestionar lo que hay dentro antes
 *
 */
public class Main {

    public static void main(String[] args) {
        //Creo una bolsa de objetos
        Usuarios usuarios = new Usuarios();
        usuarios.crear( new Usuario("uno",4) );
        usuarios.crear( new Usuario("dos",14) );
        usuarios.crear( new Usuario("tres",20) );

        //Gestiono la bolsa de objetos
        while (usuarios.hayMas()) {
            Usuario usuario = usuarios.siguiente();
            System.out.println("Usuario " + usuario.getNombre());
        }
        //Devuelvo a su posicion original
        usuarios.reinicia();
        //Agrego mas objetos a la bolsa
        usuarios.crear( new Usuario("cuatro",18) );
        //Copio un objeto de la bolsa en uno nuevo
        Usuario usuario = usuarios.siguiente();
        //Imprimo el objeto copiado
        System.out.println("Usuario " + usuario.getNombre());
    }
}
