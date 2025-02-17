package edu.estatuas.domain.estacion;

import edu.estatuas.domain.bicicleta.Bicicleta;
import edu.estatuas.domain.tarjetaUsuario.TarjetaUsuario;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Estacion {
    private final int id;
    private final String direccion;
    private final Anclajes anclajes;

     public Estacion(int id, String direccion, int numeroAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(numeroAnclajes);
    }

    private int getId(){
         return this.id;
    }

    private String getDireccion(){
         return this.direccion;
    }

    private int numAnclajes(){return this.anclajes.numAnclajes();}

    public void consultarEstacion(){
        System.out.println
                ("id: " + Integer.toString(getId()) +
                        "\ndireccion: " + getDireccion() +
                        "\nnumeroAnclajes: " + Integer.toString(numAnclajes()));
    }


    public int anclajesLibres(){

         int anclajesLibres = 0;
        for (int index = 0; index < numAnclajes(); index++) {
            if (anclajes.anclajes()[index] == null) {
                anclajesLibres++;
            }
        }
         return anclajesLibres;
    }

    public void anclarBicicleta(Bicicleta bicicleta){
         anclajes.anclajes()[anclajes.seleccionarAnclaje()].anclarBici(bicicleta);
    }

    public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario){
         return tarjetaUsuario.isActivada();
    }

    public void retirarBicicleta(TarjetaUsuario tarjetaUsuario){
         while (tarjetaUsuario.isActivada()) {
             Anclaje anclajeObservado = anclajes.anclajes()[anclajes.seleccionarAnclaje()];
             if (anclajeObservado.isOcupado()) {
                 anclajeObservado.liberarBici();
                 break;
             }
         }

    }

    private void mostrarBicicleta(Bicicleta bicicleta, Anclaje anclajeObservado){
         System.out.println("bicicleta retirada: " + bicicleta.getId() + "del anclaje: "
                 + Arrays.binarySearch(anclajes.anclajes(), anclajeObservado));
    }


    @Override
    public String toString() {
        return "Estacion{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", anclajes=" + anclajes +
                '}';
    }
}

