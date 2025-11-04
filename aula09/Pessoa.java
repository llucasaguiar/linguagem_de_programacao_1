public abstract class Pessoa {
    protected int idade;
    protected String nome;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa() {
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String exibirDados() {
        return "Nome: " + nome + ", Idade: " + idade;
    }

    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }

    public abstract void quemSouEu();
    public abstract void minhaAtividade();

}