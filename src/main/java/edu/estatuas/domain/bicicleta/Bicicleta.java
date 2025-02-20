package edu.estatuas.domain.bicicleta;

public class Bicicleta implements Movil {

    int id;

    public Bicicleta(int id){
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "id=" + id +
                '}';
    }
}
