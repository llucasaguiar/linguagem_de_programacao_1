import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.println("Digite seu nome: ");
        f.setNome(sc.nextLine());
        System.out.println("Insira sua matrícula: ");
        f.setMatricula(sc.nextInt());
        System.out.println("Digite o seu salário (R$): ");
        f.setSalarioBruto(sc.nextDouble());

        f.calcularINSS();
        f.calcularSalarioLiquido();
        f.exibirContracheque();
    }
}