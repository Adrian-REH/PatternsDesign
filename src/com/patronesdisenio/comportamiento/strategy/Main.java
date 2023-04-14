package com.patronesdisenio.comportamiento.strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int port= 1;
        Usuarios usuario = null;
        if (port==1) {
            usuario= new UsuariosFichero();
            port=1;
        }
        else if (port==0) {
            usuario= new UsuariosMemoria();


        }
        accion(usuario);

    }

    static void accion(Usuarios usuario){
        crear(usuario,"Fulano");
        crear(usuario,"Mengano");
        crear(usuario,"Pepe");

        for(String user : listar(usuario)){
            System.out.println(user);
        }

    }
    public static void crear(Usuarios usuarios, String nombre){
        usuarios.crear(nombre);
    }
    public static ArrayList<String> listar(Usuarios usuarios){
        return usuarios.listar();
    }
}
