package com.patronesdisenio.creacion.builder;

/**
 * Construye el setteo personalizado de una clase
 * de objeto devolviendo con "build" la clase
 * al finalizar lo que se quiere setear
 *
 *
 * Construye el setteo personalizado de una clase.
 */
public class Main {
    public static void main(String[] args) {
/*        Vehiculo vehiculo = new Vehiculo();

        vehiculo.setMarca("Ford");
        vehiculo.setMotor("Mustang");
        vehiculo.setTipo("Mustang");
        vehiculo.setPuerts(6);*/

        Vehiculo coche= new CocheBuilder("Ford")
                .setPuertas(6)
                .setMotor("Mustang")
                .build();

        System.out.println(coche);

        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" amigos").append(" del").append(" curso");
        System.out.println(builder);
    }
}
