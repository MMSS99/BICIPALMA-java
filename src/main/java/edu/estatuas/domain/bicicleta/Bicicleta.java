package edu.estatuas.domain.bicicleta;

public class Bicicleta {

    int id;

    Bicicleta(int id){
        this.id = id;
    }

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
