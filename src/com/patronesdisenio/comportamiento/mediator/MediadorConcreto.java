package com.patronesdisenio.comportamiento.mediator;

import java.util.ArrayList;

public class MediadorConcreto extends Mediator {

    ArrayList<Colega> colegas= new ArrayList<>();

    @Override
    void registra(Colega colega) {
        if (!colegas.contains(colega)) {
            colegas.add(colega);
            colega.setMediator(this);
        }
    }

    @Override
    void reenvia(Colega colega) {
        for (Colega coleg:colegas){
            if (!coleg.equals(colega)){
                coleg.recibe();
            }
        }
    }
}
