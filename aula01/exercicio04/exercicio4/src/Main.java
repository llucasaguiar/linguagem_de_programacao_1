//Elabore um programa que receba 3 notas (N1=7; N2=8; N3=9).
//Em seguida, calcule a média e verifique se o aluno está aprovado,
//reprovado ou na final. OBS: aprovado>=7; reprovado<4.
public class Main {
    public static void main(String[] args) {
        double N1 = 7;
        double N2 = 8;
        double N3 = 9;
        double media;

        media = ((N1+N2+N3)/3);

        if (media >= 7) {
            System.out.println("O aluno está aprovado!");
        } else if (7 > media && media >= 4) {
            System.out.println("O aluno está na final!");
        } else {
            System.out.println("O aluno está reprovado!");
        }
    }
}