package com.patronesdisenio.creacion.prototype;

/**
 * Clona el objeto anterior en un nuevo objeto,
 * usando la forma basica.
 *
 * Clona el objeto en uno nuevo.
 */
public class Main {
    public static void main(String[] args) {
        Coche coche= new Coche();
        coche.marca= "Filostros";
        coche.puertas= 6;
        coche.modelo= "Cupe";

        System.out.println(coche.toString());


        Coche clonado= coche.clonar();
        clonado.modelo="Fil";
        System.out.println(clonado);
        System.out.println(coche.toString());

    }
}
