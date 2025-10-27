public class Conta {
    protected String titular;
    protected double saldo;

    public String exibirDados() {
        return "Titular: " + titular + "Saldo: " + saldo;
    }

    public String toString() {
        return "Titular: " + titular + "Saldo: " + saldo;
    }

    public Conta(String titular, double saldo) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public Conta() {

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {

    }

    public void sacar(double valor) {

    }

}
