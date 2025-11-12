package model;

public class Gato extends Animal {
    
    public Gato(int id){
        super(id);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Miiaauu");
    }
    
    @Override
    public String toString() {
    return "Cliente: " + getNome() +
           "\nEspecie: " + getEspecie() +
           "\nIdade: " + getIdade() +
           "\nPeso: " + getPeso() +
           "\nDono: " + getDono() +
           "\nID: " + getId();
    }
}
