package model;

public class Consulta {
    private String data;
    private String hora;
    private Double valor;
    private Animal animal;
    private Veterinario veterinario;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
    
    public void exibirInfo() {
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
    return "Data: " + getData() +
           "\nHora: " + getHora() +
           "\nValor: " + getValor() +
           "\nAnimal: " + getAnimal() +
           "\nVeterinario: " + getVeterinario();
    }
   
}