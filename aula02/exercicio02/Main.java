package exercicio02;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua matrícula: ");
        int matricula = sc.nextInt();

        System.out.println("Digite seu salário bruto: ");
        int salarioBruto = sc.nextInt();

        double descontoINSS = salarioBruto * 0.15;
        double salarioLiquido = salarioBruto - descontoINSS;

        System.out.println("---CONTRACHEQUE---");

        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Desconto do INSS: " + descontoINSS);
        System.out.println("Salário Líquido: " + salarioLiquido);

        sc.close();
    }
}