package com.patronesdisenio.estructura.decorador;

public class TelefonoBasico implements Telefono {
    @Override
    public void create() {
        System.out.println("Soy un telefono basico: " );
        tengoGSM();
        tengoSMS();
    }

    private void tengoGSM() {
        System.out.println(" > Telefono Basico Tengo GSM");
    }
    private void tengoSMS() {
        System.out.println(" -> Telefono Basico Tengo SMS");
    }
}
