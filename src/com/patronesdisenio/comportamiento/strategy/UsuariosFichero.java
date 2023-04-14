package com.patronesdisenio.comportamiento.strategy;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosFichero implements Usuarios{
    private String ficheroUsuarios = "usuarios.txt";
    private PrintStream fichero;
    public UsuariosFichero() {
        try {
            fichero= new PrintStream(ficheroUsuarios);
        }catch (Exception e){
            System.out.println("no puedo abrirlo: "+e.getMessage());
        }
    }
    @Override
    public void crear(String nombre){
        fichero.println(nombre);
    }
    @Override
    public ArrayList<String> listar(){
        ArrayList<String> usuarios = new ArrayList<String>();

        try {
            Scanner scanner= new Scanner(new File(ficheroUsuarios));

            while(scanner.hasNextLine()){
                usuarios.add(scanner.nextLine());
            }

        }catch (Exception e){
            System.out.println("no puedo abrirlo: "+e.getMessage());
        }
        return usuarios;
    }
}
