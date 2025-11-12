package model;

import java.util.Objects;

public class Cliente extends Pessoa{
    private boolean planoSaude;
    
    public Cliente(String nome, String telefone, String cpf, boolean planoSaude){
        super(nome, telefone, cpf); //Chama o construtor da classe Pessoa
        this.planoSaude = planoSaude;
    }
    
    public boolean getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(boolean planoSaude) {
        this.planoSaude = planoSaude;
    }

    @Override
    public void exibirInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
    return "Cliente: " + getNome() +
           "\nCPF: " + getCpf() +
           "\nTelefone: " + getTelefone() +
           "\nTem plano? " + (planoSaude ? "Sim" : "Não");
}
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        return Objects.equals(getCpf(), other.getCpf());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getCpf());
    }
}
