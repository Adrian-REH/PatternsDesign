package com.patronesdisenio.comportamiento.observer;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Emisora {
    private ArrayList<Receptor> receptor = new ArrayList<Receptor>();

    public void meteReceptor(Receptor receptor) {
        this.receptor.add(receptor);
    }

    String str="";
   Stream<String> capitalize = str->str.toUpperCase();
    public void emite(){
        for (Receptor receptor : receptor) {
            receptor.recibe();
        }
    }

}
