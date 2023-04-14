package com.patronesdisenio.creacion.factory;

public class PrecioFactory {

    Precio precio;

    private PrecioFactory() {
    }

    public PrecioFactory(String pais){

        switch (pais){
            case "UK":
                System.out.println("UK, precio en GBP");
                precio= new PrecioGBP();
                break;
            case "España":
                System.out.println("España, precio en EUR");
                precio= new PrecioEUR();
                break;
            case "USA":
                System.out.println("USA, precio en USD");
                precio= new PrecioUSD();
                break;

        }

    }

    public double getPrecio(){
        return precio.getPrecio();
    }



}
