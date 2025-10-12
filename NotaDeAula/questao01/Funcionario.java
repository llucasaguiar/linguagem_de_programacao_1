public class Funcionario {
        private int matricula;
        private String nome;
        private Double salarioBruto;
        private Double desconto;
        private Double salarioLiquido;

        public Funcionario() {
        }

        public int getMatricula() {
            return matricula;
        }

        public void setMatricula(int matricula) {
            this.matricula = matricula;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Double getSalarioBruto() {
            return salarioBruto;
        }

        public void setSalarioBruto(Double salarioBruto) {
            this.salarioBruto = salarioBruto;
        }

        public Double getDesconto() {
            return desconto;
        }

        public void setDesconto(Double desconto) {
            this.desconto = desconto;
        }

        public Double getSalarioLiquido() {
            return salarioLiquido;
        }

        public void setSalarioLiquido(Double salarioLiquido) {
            this.salarioLiquido = salarioLiquido;
        }

        public void calcularINSS() {
            desconto = salarioBruto * 0.15;
        }

        public void calcularSalarioLiquido() {
            salarioLiquido = salarioBruto - desconto;
        }

        public void exibirContracheque() {
            System.out.println("Matrícula: " + matricula);
            System.out.println("Nome: " + nome);
            System.out.println("Salário Bruto (R$): " + salarioBruto);
            System.out.println("Desconto do INSS (R$): " + desconto);
            System.out.println("Salário Líquido (R$): " + salarioLiquido);
        }
    }
