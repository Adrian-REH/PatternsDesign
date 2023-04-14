package com.patronesdisenio.creacion.prototype2;

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
