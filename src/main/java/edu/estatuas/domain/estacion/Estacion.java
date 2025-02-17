package edu.estatuas.domain.estacion;

public class Estacion {
    private final int id;
    private final String direccion;
    private final int numeroAnclajes;
    private final Anclajes[] anclajes;

     public Estacion(int id, String direccion, int numeroAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
        this.anclajes = new Anclajes[numeroAnclajes];
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
                        "\nnumeroAnclajes: " + Integer.toString(numAnclajes()));
    }


    public int anclajesLibres(){

         int anclajesLibres = 0;
         for(int i = 0; i < anclajes.length; i++){
             if (anclajes[i] == null){anclajesLibres++;}
         }
         return anclajesLibres;
    }

    public void generarAnclaje(){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
