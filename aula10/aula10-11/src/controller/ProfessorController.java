package controller;

import model.Professor;
import service.CadastroProfessor;

import java.util.List;

public class ProfessorController {
    private CadastroProfessor professorService = new CadastroProfessor();

    public void cadastrarProfessor(Professor professor) {
        professorService.cadastrarProfessor(professor);
    }
    public List<Professor> listarProfessores() {
        return professorService.listarProfessores();
    }
    public void atualizarProfessor(String nome, String novoNome) {
        professorService.atualizarProfessor(nome, novoNome);
    }
    public void deletarProfessor(String nome) {
        professorService.deletarProfessor(nome);
    }

}
