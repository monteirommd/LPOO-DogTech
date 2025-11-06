package model;

public class Cliente extends Pessoa{
    private boolean planoSaude;

    public boolean getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(boolean planoSaude) {
        this.planoSaude = planoSaude;
    }

    @Override
    public void exibirInfo(){
        System.out.println("Nome do cliente " + getNome() +
                "\nCPF: " + getCpf() +
                "\nTelefone: " + getTelefone() +
                "\nPlano de saúde: " + (getPlanoSaude() ? "Sim!": "Não"));
    }
}
