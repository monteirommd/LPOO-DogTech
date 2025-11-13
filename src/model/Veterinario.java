package model;

public class Veterinario extends Pessoa{
    private String crmv;
    private String especialidade;

    public Veterinario(String nome, String telefone, String cpf, String crmv){
        super(nome, telefone, cpf);
        this.crmv = crmv;
    }
    
    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void exibirInfo() {
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
    return "Nome: " + getNome() +
           "\nCPF: " + getCpf() +
           "\nTelefone: " + getTelefone() +
           "\nCRMV: " + getCrmv() +
           "\nEspecialidade: " + getEspecialidade();
    }


}
