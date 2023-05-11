package com.patronesdisenio.comportamiento.state;

/**
 * Estructura de forma tecnica la
 */
public class Main {
    public static void main(String[] args) {

        Telefono tel1= new Telefono();
        Telefono tel2= new Telefono();


        System.out.println(tel1.estado.desbloquear());
        System.out.println(tel1.estado.abrirCamara());
        System.out.println(tel1.estado.hacerFoto());
        System.out.println(tel1.estado.hacerFoto());
    }
}
