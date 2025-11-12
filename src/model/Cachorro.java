package model;

public class Cachorro extends Animal {
    
    public Cachorro(int id){
        super(id);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("AuAuAu");
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
