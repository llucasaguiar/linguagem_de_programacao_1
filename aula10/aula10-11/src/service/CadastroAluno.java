package service;

import model.Aluno;

import java.util.ArrayList;

public class CadastroAluno {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void cadastrar(Aluno a){
        alunos.add(a);
        System.out.println("model.Aluno cadastrado: "+ a.getNome());
        System.out.println("Idade: "+ a.getIdade());
        System.out.println("Matrícula: "+ a.getMatricula());
        System.out.println("Nota 1: "+ a.getNota1());
        System.out.println("Nota 2: "+ a.getNota2());
        System.out.println("Nota 3: "+ a.getNota3());
    }
    public void listar(){
        for (Aluno a : alunos){
            System.out.println("model.Aluno listado: "+ a.getNome());
            System.out.println("Idade: "+ a.getIdade());
            System.out.println("Matrícula: "+ a.getMatricula());
            System.out.println("Nota 1: "+ a.getNota1());
            System.out.println("Nota 2: "+ a.getNota2());
            System.out.println("Nota 3: "+ a.getNota3());
        }
    }
}
