import java.util.ArrayList;

public class CadastroProfessor {

    private ArrayList<Professor> professores = new ArrayList<>();

    //@PostMapping - CADASTRAR
    public void cadastrar(Professor p) {
        professores.add(p);
        System.out.println("Professor cadastrado: " + p.getNome());
    }

    //@GetMapping - READ
    public void listar() {
        for (Professor p : professores) {
            System.out.println("Nome: " + p.getNome());
            //System.out.println(a); chama automaticamente a toString()
        }
    }

    //@PutMapping - UPDATE
    public void atualizar(String nomepesq, int novaIdade) {
        for (Professor p : professores) {
            if (p.getNome().equalsIgnoreCase(nomepesq)) {
                p.setIdade(novaIdade);
                System.out.println("Idade atualizada: " + novaIdade);
                return;
            }
        }
        System.out.println("Professor não encontrado.");
    }

    //@DeleteMapping - DELETE
    public void deletar(String nome) {
        for (Professor p : professores) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                professores.remove(p);
                System.out.println("Removido com sucesso.");
            }
        }
        System.out.println("Professor não encontrado.");
    }
}
