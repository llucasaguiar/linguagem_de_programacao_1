import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Pessoa a = new Aluno();
        Pessoa prof = new Professor();
        CadastroProfessor cp = new CadastroProfessor();

        //cadastro para profesor
        //cadastro para aluno

        System.out.print("Nome completo: ");
        prof.setNome(sc2.nextLine());

        System.out.print("Idade: ");
        prof.setIdade(sc.nextInt());

        //CADASTRAR
        cp.cadastrar((Professor) prof);

        //LISTAR
        cp.listar();

        //ATUALIZAR
        System.out.println("Informe o nome que deseja atualizar a idade: ");
        String nomepesq = sc2.nextLine();
        System.out.println("Nova idade: ");
        int novaIdade = sc.nextInt();
        cp.atualizar(nomepesq, novaIdade);

        //DELETAR
        System.out.println("Informe o nome para deletar: ");
        prof.setNome(sc2.nextLine());
        cp.deletar(prof.getNome());

        System.out.println("Matrícula: ");
        ((Aluno) a).setMatricula(sc.nextInt());

        System.out.println("Nota 1: ");
        ((Aluno) a).setNota1(sc.nextDouble());

        System.out.println("Nota 2: ");
        ((Aluno) a).setNota2(sc.nextDouble());

        System.out.println("Nota 3: ");
        ((Aluno) a).setNota3(sc.nextDouble());

        /*System.out.println("Nome completo: " + prof.getNome());
        System.out.println("Idade: " + prof.getIdade());
        System.out.println("Matrícula: " + a.getMatricula());
        System.out.println("Notas 1, 2 e 3 respectivamente: " + a.getNota1() + "; " + a.getNota2() + "; " + a.getNota3());

        */

        ((Aluno) a).calcularMedia();
        System.out.println("Média: " + ((Aluno) a).getMedia());

        System.out.println("Informações do Professor: ");
        System.out.println(prof);

        System.out.println("Informações do Aluno: ");
        System.out.println(a);

        ((Professor) prof).setCargo(CARGO.prof);
        System.out.println(((Professor) prof).getCargo());

    }
}