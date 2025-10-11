//Faça um programa que calcule o salário de um funcionário com
//base no valor da hora trabalhada de R$15,00 e na quantidade
//de 40 horas trabalhadas e exiba o salário.
public class Main {
    public static void main(String[] args) {
        double horaTrabalhada = 40;
        int valorHora = 15;
        double salario;

        salario = horaTrabalhada * valorHora;

        System.out.println("O salário do funcioário será de R$ " + salario);
    }
}