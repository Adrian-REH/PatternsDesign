package com.patronesdisenio.estructura.facade;

import java.io.File;

/**
 * Oculta la estructura de forma organizada usando
 * el principio de responsabilidad unica
 */
public class Main {
    public static void main(String[] args) {

        VideoConversionFacade conversor = new VideoConversionFacade();
        conversor.convertVideo("fichero,orgg","mp4");
    }
}
