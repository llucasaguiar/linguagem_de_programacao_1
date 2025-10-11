//Elabore um programa que verifique se uma palabra é igual ou
//diferente de outra palavra.
public class Main {
    public static void main(String[] args) {

        String a = "Pyhton";
        String b = "Java";

        if (a.equalsIgnoreCase(b)) {
            System.out.println("As palavras são iguais.");
        } else {
            System.out.println("As palavras são diferente.");
        }

    }
}