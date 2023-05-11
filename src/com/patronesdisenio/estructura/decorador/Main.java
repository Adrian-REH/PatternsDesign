package com.patronesdisenio.estructura.decorador;

/**
 *
 * Estructura una interfaz para usar multiples soluciones
 * combinandolas
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
