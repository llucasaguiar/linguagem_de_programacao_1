import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();
        Professor prof = new Professor();

        System.out.print("Nome completo: ");
        prof.setNome(sc.nextLine());

        System.out.print("Idade: ");
        prof.setIdade(sc.nextInt());

        System.out.println("Matrícula: ");
        a.setMatricula(sc.nextInt());

        System.out.println("Nota 1: ");
        a.setNota1(sc.nextDouble());

        System.out.println("Nota 2: ");
        a.setNota2(sc.nextDouble());

        System.out.println("Nota 3: ");
        a.setNota3(sc.nextDouble());

        /*System.out.println("Nome completo: " + prof.getNome());
        System.out.println("Idade: " + prof.getIdade());
        System.out.println("Matrícula: " + a.getMatricula());
        System.out.println("Notas 1, 2 e 3 respectivamente: " + a.getNota1() + "; " + a.getNota2() + "; " + a.getNota3());

        */

        a.calcularMedia();
        System.out.println("Média: " + a.getMedia());

        System.out.println("Informações do Professor: ");
        System.out.println(prof);

        System.out.println("Informações do Aluno: ");
        System.out.println(a);

        prof.setCargo(CARGO.prof);
        System.out.println(prof.getCargo());

    }
}