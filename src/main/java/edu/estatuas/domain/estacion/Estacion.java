package edu.estatuas.domain.estacion;

public class Estacion {
    private final int id;
    private final String direccion;
    private final int numeroAnclajes;

     public Estacion(int id, String direccion, int numeroAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
    }

    private int getId(){
         return this.id;
    }

    private String getDireccion(){
         return this.direccion;
    }

    private int numAnclajes(){return this.numeroAnclajes;}

    public void consultarEstacion(){
        System.out.println
                ("id: " + Integer.toString(getId()) +
                        "\ndireccion: " + getDireccion() +
                        "\nnumeroAnclajes" + Integer.toString(numAnclajes()));
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
