package exercicio01;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String r;

        do {
            System.out.println("Digite seu nome: ");
            String nome = sc.next();

            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);

        System.out.println("Para fazer um novo cadastro, digite S.");
        r = sc.next();

        } while (r.equalsIgnoreCase("S"));
    }
}