package edu.estatuas.domain.tarjetaUsuario;

public class TarjetaUsuario {
    private final String id;
    private boolean activada;

    public TarjetaUsuario(String id, boolean estado){
        this.id = id;
        this.activada = estado;
    }

    public boolean isActivada() {
        return activada;
    }

    public void setActivada(boolean nuevoEstado) {
        this.activada = nuevoEstado;
    }

    @Override
    public String toString() {
        return "TarjetaUsuario{" +
                "id='" + id + '\'' +
                ", activada=" + activada +
                '}';
    }
}
