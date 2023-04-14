package com.patronesdisenio.creacion.singelton;

public class Main {
    public static void main(String[] args) {

        Singelton singelton = Singelton.getInstance();

        singelton.setContador(10);
        System.out.println(singelton.getContador());;
        System.out.println(singelton);

        Singelton singelton2 = Singelton.getInstance();

        singelton2.setContador(15);
        System.out.println(singelton2.getContador());;
        System.out.println(singelton2);

        singelton.Run();
        singelton2.Run();
    }
}