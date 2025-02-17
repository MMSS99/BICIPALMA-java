package edu.estatuas.domain.estacion;

import edu.estatuas.domain.bicicleta.Bicicleta;
import edu.estatuas.domain.tarjetaUsuario.TarjetaUsuario;

import java.util.Arrays;

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
                ("id: " + (getId()) +
                        "\ndireccion: " + getDireccion() +
                        "\nnumeroAnclajes: " + (numAnclajes()));
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
         Anclaje anclajeObservado = anclajes.anclajes()[anclajes.seleccionarAnclaje()];
         anclajeObservado.anclarBici(bicicleta);
         mostrarAnclaje(bicicleta, anclajeObservado);
    }

    public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario){
         return tarjetaUsuario.isActivada();
    }

    public void retirarBicicleta(TarjetaUsuario tarjetaUsuario){
         while (tarjetaUsuario.isActivada()) {
             Anclaje anclajeObservado = anclajes.anclajes()[anclajes.seleccionarAnclaje()];
             if (anclajeObservado.isOcupado()) {
                 anclajeObservado.liberarBici();
                 mostrarBicicleta(anclajeObservado.getBici(), anclajeObservado);
                 break;
             }
         }

    }

    private void mostrarBicicleta(Bicicleta bicicleta, Anclaje anclajeObservado){
         System.out.println("bicicleta retirada: " + bicicleta.getId() + "del anclaje: "
                 + (Arrays.asList(anclajes.anclajes()).indexOf(anclajeObservado)));
    }

    private void mostrarAnclaje(Bicicleta bicicleta, Anclaje anclajeObservado){
         System.out.println("bicicleta " + bicicleta.getId() + "anclada en anclaje: "
                 + (Arrays.asList(anclajes.anclajes()).indexOf(anclajeObservado)));

    }

    public void consultarAnclajes(){
         for (int index = 0; index < numAnclajes(); index++) {
             Anclaje anclajeObservado = anclajes.anclajes()[index];
             if (anclajeObservado.isOcupado()) {
                 System.out.println("anclaje " + (Arrays.asList(anclajes.anclajes()).indexOf(anclajeObservado))
                         + " " + anclajeObservado.getBici().getId());
             } else {
                 System.out.println("anclaje " + (Arrays.asList(anclajes.anclajes()).indexOf(anclajeObservado))
                         + " libre");
             }
         }
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

