package exercicio03;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String r;
        double somarNotas = 0;
        int contadorNotas = 0;

        do {
            System.out.println("Insira uma nota do aluno: ");
            double nota = sc.nextDouble();

            somarNotas += nota;
            contadorNotas++;

            while (true) {
                System.out.println("Deseja inserir outra nota? (Digite 'S' para Sim ou 'N' para Não): .");
                r = sc.next();
                if (r.equalsIgnoreCase("S") || r.equalsIgnoreCase("N")) {
                    break;
                } else {
                    System.out.println("Opção inválida! Tente novamente.");
                }
            }
        } while (r.equalsIgnoreCase("S"));

        while (contadorNotas > 0) {
            double media = somarNotas / contadorNotas;
            System.out.println("Média: " + media);
            break;
        }
        System.out.println("Programa encerrado.");
        sc.close();
    }
}