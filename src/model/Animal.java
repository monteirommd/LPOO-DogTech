package model;

public abstract class Animal {
    private String nome;
    private String especie;
    private int idade;
    private float peso;
    private Cliente dono;
    private int id;
    
    public Animal(int id){
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public boolean equals(Object obj){
        
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Animal outro = (Animal) obj;  
        return this.id == outro.id; //compara IDs
    }
    
    @Override
    public int hashCode(){
        return Integer.hashCode(id);
    }
}
