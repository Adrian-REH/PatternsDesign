package com.patronesdisenio.estructura.adapter;

/**
 * Adapta muchas soluciones a un servicio por separado
 */
public class Main {
    public static void main(String[] args) {
        Horno horno = new Horno();
        Lampara lampara = new Lampara();
        PowerAdapter powerAdapter = new PowerAdapter();


        enciende(horno);
        enciende(lampara);


        System.out.println(estaEncendido(horno));
        System.out.println(estaEncendido(lampara));
        System.out.println(estaEncendido(powerAdapter));
    }

    public static void enciende(Enchufable enchufable) {
        enchufable.enciende();
    }
    public static void apaga(Enchufable enchufable) {
        enchufable.apaga();
    }
    public static boolean estaEncendido(Enchufable enchufable) {
        return enchufable.estaEncendido();
    }
}
