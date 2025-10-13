import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Filme f = new Filme();
        Filme filme = null;
        String r;
        do {
            System.out.println("Menu - Plataforma de Streaming");
            System.out.println("Digite 1 - Cadastrar filme");
            System.out.println("Digite 2 - Avaliar o filme");
            System.out.println("Digite 3 - Informações do filme");
            System.out.println("Digite 4 - Informações e avaliação do filme");
            int x = sc.nextInt();
            sc.nextLine();
            switch (x) {
                case 1:
                    System.out.println("1 - Cadastrar filme");
                    System.out.println("Informe o nome do filme: ");
                    f.setNome(sc.nextLine());
                    System.out.println("Informe o gênero do filme: ");
                    f.setGenero(sc.nextLine());
                    System.out.println("Informe o ano de lançamento do filme: ");
                    f.setAno(sc.nextInt());
                    System.out.println("Informe a duração em minutos do filme: ");
                    f.setDuracao(sc.nextInt());

                    filme = new Filme(f.getNome(), f.getGenero(), f.getAno(), f.getDuracao());
                    System.out.println("Filme cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("2 - Avaliar o filme");
                    if (filme != null) {
                        System.out.println("Informe sua nota (0 a 10): ");
                        int nota = sc.nextInt();
                        f.avaliar(nota);
                    } else {
                        System.out.println("Cadastre um filme antes de avaliar.");
                    }
                    break;
                case 3:
                    System.out.println("3 - Informações do filme");
                    if (filme != null) {
                        f.exibirDetalhes();
                    } else {
                        System.out.println("Nenhum filme cadastrado.");
                    }
                    break;
                case 4:
                    f.exibirDetalhes();
                    f.calcularMediaAvaliacoes();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            while (true) {
                System.out.println("Digite S para escolher outra opção ou N para encerrar.");
                r = sc.next();
                if (r.equalsIgnoreCase("S") || r.equalsIgnoreCase("N")) {
                    break;
                } else {
                    System.out.println("Opção inválida! Tente novamente.");
                }
            }
        } while (r.equalsIgnoreCase("S"));
        System.out.println("Programa encerrado.");
        sc.close();
    }
}