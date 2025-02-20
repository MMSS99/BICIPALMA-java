package edu.estatuas.domain.estacion;

import edu.estatuas.domain.bicicleta.Movil;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Anclajes {

    private final Anclaje[] anclajes;

    Anclajes(int cantidadAnclajes){
        this.anclajes = new Anclaje[cantidadAnclajes];
        crearAnclajes();
    }

    private void crearAnclajes(){
        for (int i = 0; i < numAnclajes(); i++){
            anclajes[i] = new Anclaje();
        }

    }

    Anclaje[] anclajes(){
        return this.anclajes;
    }

    int numAnclajes(){
        return this.anclajes.length;
    }

    void ocuparAnclaje(int indiceAnclaje, Movil bicicleta){
        anclajes[indiceAnclaje].anclarBici(bicicleta);
    }

    boolean isAnclajeOcupado(int indiceAnclaje){
        return anclajes[indiceAnclaje].isOcupado();
    }

    void liberarAnclaje(int indiceAnclaje){
        anclajes[indiceAnclaje].liberarBici();
    }

    Movil getBiciAt(int indiceAnclaje){
        return anclajes[indiceAnclaje].getBici();
    }

    int seleccionarAnclaje(){
        // return random Anclaje?????
        return ThreadLocalRandom.current().nextInt(0, numAnclajes());
    }

    @Override
    public String toString() {
        return "Anclajes{" +
                "anclajes=" + Arrays.toString(anclajes) +
                '}';
    }
}
