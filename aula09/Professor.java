public final class Professor extends Pessoa implements FolhaDePagamento {
    private String especialidade;
    public CARGO cargo;

    public Professor(String nome, int idade, String especialidade) {
        super(nome, idade);
        this.especialidade = especialidade;
    }

    public Professor() {
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String toString() {
        return super.toString() + ", Especialidade: " + especialidade;
    }

    @Override
    public void quemSouEu() {

    }

    @Override
    public void minhaAtividade() {

    }

    public CARGO getCargo() {
        return cargo;
    }

    public void setCargo(CARGO cargo) {
        this.cargo = cargo;
    }

    @Override
    public void pagamento() {

    }
}