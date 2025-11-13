package model;

public class Gato extends Animal {
    
    public Gato(int id){
        super(id);
    }
    
    @Override
    public String toString() {
    return "Nome: " + getNome() +
           "\nEspecie: " + getEspecie() +
           "\nIdade: " + getIdade() +
           "\nPeso: " + getPeso() +
           "\nDono: " + getDono() +
           "\nID: " + getId();
    }
}
