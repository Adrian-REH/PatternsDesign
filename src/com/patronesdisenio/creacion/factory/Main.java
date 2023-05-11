package com.patronesdisenio.creacion.factory;


/**Fabrica una construccion de classe como soluciones
 * para un determinado problema, usa distintas clases de objetos
 * y las organiza para poder ser utilizada en cualquier momento
 * intermediando el servicio "Factory", y cada clase ocupa una
 * sola interfaz "precio"
 *
 * Organiza las clases de objetos para ser instanciadas
 */
public class Main {
    public static void main(String[] args) {
        PrecioFactory precio=new PrecioFactory("España");
        System.out.println(precio.getPrecio());
        PrecioFactory precio2=new PrecioFactory("USA");
        System.out.println(precio2.getPrecio());
        PrecioFactory precio3=new PrecioFactory("UK");
        System.out.println(precio3.getPrecio());




    }
}
