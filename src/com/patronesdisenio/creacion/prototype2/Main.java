package com.patronesdisenio.creacion.prototype2;

/**
 * Intenta clonar el dato asignado con
 * anterioridad en un nuevo objeto,
 * recuperando asi las dos partes
 * implementando clone en la clase del objeto
 *
 *
 * Clona el objeto en uno nuevo usando Exceptions
 */
public class Main {
    public static void main(String[] args) {
        Coche coche= new Coche();
        coche.marca= "Filostros";
        coche.puertas= 6;
        coche.modelo= "Cupe";

        System.out.println(coche.toString());
        Coche clonado; ;

        try {
            clonado=coche.clonar();
            clonado.modelo="Fil";
            System.out.println(clonado);
            System.out.println(coche.toString());

        } catch(CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

    }
}
