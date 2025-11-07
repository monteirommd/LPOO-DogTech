package model;

public class Cachorro extends Animal {
    
    public Cachorro(int id){
        super(id);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("AuAuAu");
    }
}
