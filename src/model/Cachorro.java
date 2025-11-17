package model;

public class Cachorro extends Animal {
    
    String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
   
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
           "\nID: " + getId() +
           "\nRaça: " + getRaca();
    }
}
