package edu.estatuas.domain.estacion;

import edu.estatuas.domain.bicicleta.Movil;

public class Anclaje {
    private boolean ocupado;
    private Movil bici;

    Anclaje() {
        this.ocupado = false;
        this.bici = null;
    };

    public boolean isOcupado() {
        return this.ocupado;
    }

    public Movil getBici() {
        return bici;
    }

    public void anclarBici(Movil bici) {
        this.bici = bici;
        this.ocupado = true;
    }

    public void liberarBici(){
        this.bici = null;
        this.ocupado = false;
    }

    @Override
    public String toString() {
        return "Anclaje{" +
                "ocupado=" + ocupado +
                ", bici=" + bici +
                '}';
    }
}
