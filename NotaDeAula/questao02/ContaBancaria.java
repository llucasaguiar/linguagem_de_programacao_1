import java.util.Scanner;

public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;
    private double valor;
    private int destino;

    public void ContaBancaria() {
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getValor() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o valor: R$ ");
        return sc.nextDouble();
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo + ".");
    }

    public void depositar(Double valor) {
        saldo = saldo + valor;

    }

    public void sacar(Double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo = saldo - valor;
            System.out.println("Saque no valor R$ " + valor + " realizado.");
            System.out.println("Novo Saldo: R$ " + saldo + ".");
        }
    }

    public void transferir(int numeroConta, Double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para transferência!");
        } else {
            saldo = saldo - valor;
            System.out.println("Valor de R$ " + valor + " transferido para a conta: " + numeroConta + ".");
            System.out.println("Novo Saldo: R$ " + saldo + ".");
        }
    }
}
