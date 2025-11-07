package model;

public class Gato extends Animal {
    
    public Gato(int id){
        super(id);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Miiaauu");
    }
}
