package com.patronesdisenio.estructura.decorador;

/**
 * Sistema de notificacion
 *
 * para distintas redes sociales
 * disparando en las clases (Redes sociales)
 *
 *
 */
public class Main {
    public static void main(String[] args) {
/*
        TelefonoBasico telefonoBasico = new TelefonoBasico();
        telefonoBasico.create();
*/


      /*
      TelefonoInteligente telefonoInteligente = new TelefonoInteligente(new TelefonoBasico());

        telefonoInteligente.create();
*/
        TelefonoNextGen telefonoNextGen = new TelefonoNextGen(new TelefonoBasico());

        telefonoNextGen.create();
    }
}
