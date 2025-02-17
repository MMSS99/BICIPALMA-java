package edu.estatuas.domain.estacion;

import edu.estatuas.domain.bicicleta.Bicicleta;
import edu.estatuas.domain.bicicleta.Movil;

public class Anclaje {
    private boolean ocupado;
    private Bicicleta bici;

    Anclaje() {
        this.ocupado = false;
        this.bici = null;
    };

    public boolean isOcupado() {
        return this.ocupado;
    }

    public Bicicleta getBici() {
        return bici;
    }

    public void anclarBici(Bicicleta bici) {
        this.bici = bici;
        this.ocupado = true;
    }

    public void liberarBici(){
        this.bici = null;
        this.ocupado = false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
