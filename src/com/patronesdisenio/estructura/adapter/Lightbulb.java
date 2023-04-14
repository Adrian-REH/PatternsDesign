package com.patronesdisenio.estructura.adapter;

public class Lightbulb {
    boolean poweredOn= false;
    int voltage=0;

    public void turnOn(int voltage) {
        poweredOn=true;
        this.voltage=voltage;

        System.out.println("Turned on voltage " + voltage);
    }

    public void turnOff() {
        poweredOn=false;
        this.voltage=0;

        System.out.println("Turned off");
    }
    public boolean isPoweredOn() {
        return poweredOn;


    }
}
