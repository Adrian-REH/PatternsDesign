package com.patronesdisenio.creacion.singelton;

/**
 * Instancia compartida
 * evita multiplos instancias y ahorra recursos
 */
public class Singelton {

    private static Singelton singelton;
    private static boolean isRunning;

    int contador ;

    private Singelton() {
    }
    public static Singelton getInstance() {
        if (singelton == null) {
            singelton=new  Singelton();
        }
        return singelton;
    }

    public void Run() {
        if (!isRunning){
            System.out.println("Arrancando!");

            isRunning=true;
        }else {

            System.out.println("Ya esta en ejecucion!");
        }

    }
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

}
