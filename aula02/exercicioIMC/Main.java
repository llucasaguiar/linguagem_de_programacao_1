import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Digite sua altura (em metros): ");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Classificação: baixo peso.");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Classificação: nomal.");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Classificação: sobrepeso.");
        } else {
            System.out.println("Classificação: obesidade.");
        }

        sc.close();
    }
}