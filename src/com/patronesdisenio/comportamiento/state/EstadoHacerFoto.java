package com.patronesdisenio.comportamiento.state;

public class EstadoHacerFoto extends Estado {
    public EstadoHacerFoto(Telefono telefono) {
        super(telefono);
    }
    @Override
    public String desbloquear() {
        return "(desbloquear()): El movil ya esta desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "(abrirCamara()): la camara esta abierta";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoDesbloqueado(telefono));
        return "(hacerFoto()): La foto se ha hecho!!";
    }
}
