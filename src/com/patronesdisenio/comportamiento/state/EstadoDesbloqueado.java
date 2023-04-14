package com.patronesdisenio.comportamiento.state;

public class EstadoDesbloqueado extends Estado {
    public EstadoDesbloqueado(Telefono telefono) {
        super(telefono);
    }
    @Override
    public String desbloquear() {
        return "(desbloquear()): El movil ya esta desbloqueado";
    }

    @Override
    public String abrirCamara() {
        telefono.cambiaEstado(new EstadoCamaraAbierta(telefono));

        return "(abrirCamara()): Camara abierta";
    }

    @Override
    public String hacerFoto() {
        return "(hacerFoto()): no se puede hacer una foto sin abrir la camara";
    }
}
