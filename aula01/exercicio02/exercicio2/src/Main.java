//Elabore um programa que verifique se uma variável inteira é
//maior, menor ou igual a outra variável inteira.
public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        if (num1 > num2) {
            System.out.println("A variável " + num1 + " é maior que " + num2);
        } else if (num1 == num2) {
            System.out.println(" A variável " + num1 + " é igual a " + num2);
        } else {
            System.out.println("A variável " + num1 + " é menor que " + num2);
        }
    }
}