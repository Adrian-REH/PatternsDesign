package com.patronesdisenio.comportamiento.state;

public class EstadoCamaraAbierta extends Estado {
    public EstadoCamaraAbierta(Telefono telefono) {
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
        telefono.cambiaEstado(new EstadoHacerFoto(telefono));
        return "(hacerFoto()): La foto ha sido habilitada";
    }
}
