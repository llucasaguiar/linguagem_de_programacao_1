import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //instanciar objetos; OBSERVAÇÃO SLIDE

        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();
        Aluno a = new Aluno("Lucas", 30, 20251);

        System.out.print("Nome completo: ");
        p.setNome(sc.nextLine());

        System.out.print("Idade: ");
        p.setIdade(sc.nextInt());

        System.out.println("Matrícula: ");
        a.setMatricula(sc.nextInt());

        System.out.println("Nota 1: ");
        a.setNota1(sc.nextDouble());

        System.out.println("Nota 2: ");
        a.setNota2(sc.nextDouble());

        System.out.println("Nota 3: ");
        a.setNota3(sc.nextDouble());

        System.out.println("Nome completo: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Matrícula: " + a.getMatricula());
        System.out.println("Notas 1, 2 e 3 respectivamente: " + a.getNota1() + "; " + a.getNota2() + "; " + a.getNota3());
        // linha para fazer o cálculo da média e depois exibí-la.
        a.calcularMedia();
        System.out.println("Média: " + a.getMedia());


    }
}