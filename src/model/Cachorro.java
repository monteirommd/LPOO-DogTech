package model;

public class Cachorro extends Animal {
    
    public Cachorro(int id){
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
