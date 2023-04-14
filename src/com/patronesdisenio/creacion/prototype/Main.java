package com.patronesdisenio.creacion.prototype;

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

    }
}
