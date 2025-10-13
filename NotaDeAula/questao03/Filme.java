public class Filme {
    private String nome;
    private String genero;
    private int ano;
    private int duracao;
    private double somaNotas;
    private int qtdAvaliacoes;
    private Double media;

    public Filme() {
    }

    public Filme(String nome, String genero, int ano, int duracao) {
        this.nome = nome;
        this.genero = genero;
        this.ano = ano;
        this.duracao = duracao;
        this.somaNotas = 0.00;
        this.qtdAvaliacoes = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getSomaNotas() {
        return somaNotas;
    }

    public void setSomaNotas(double somaNotas) {
        this.somaNotas = somaNotas;
    }

    public int getQtdAvaliacoes() {
        return qtdAvaliacoes;
    }

    public void setQtdAvaliacoes(int qtdAvaliacoes) {
        this.qtdAvaliacoes = qtdAvaliacoes;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public void exibirDetalhes() {
        System.out.println("Detalhes sobre o filme");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de lançamento: " + ano);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("--------------------------");

    }

    public void avaliar(int nota) {
        if (nota >= 0 && nota <= 10) {
            somaNotas += nota;
            qtdAvaliacoes++;
            System.out.println("Avaliação realizada com sucesso!");
        } else {
            System.out.println("Nota invalida! Digite um valor inteiro de 0 a 10");
        }
    }

    public void calcularMediaAvaliacoes() {
        if (qtdAvaliacoes == 0) {
            System.out.println("Filme não é cadastrado ou não apresenta avaliações.");
        } else {
            media = somaNotas / qtdAvaliacoes;
            System.out.println("Média das avaliações: " + media);
        }
    }
}
