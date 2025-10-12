import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria cb = new ContaBancaria();
        String r;
        do {
            System.out.println("Digite 1 - Consultar saldo");
            System.out.println("Digite 2 - Depositar");
            System.out.println("Digite 3 - Sacar");
            System.out.println("Digite 4 - Transferir");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Opção 1 escolhida - Consultar saldo.");
                    cb.consultarSaldo();
                    break;
                case 2:
                    System.out.println("Opção 2 escolhia - Depositar");
                    cb.depositar(cb.getValor());
                    break;
                case 3:
                    System.out.println("Opção 3 escolhia - Sacar");
                    cb.sacar(cb.getValor());
                    break;
                case 4:
                    System.out.println("Opção 4 escolhida - Transferir");
                    System.out.println("Digite o número da conta de destino: ");
                    int numeroConta = sc.nextInt();
                    cb.transferir(numeroConta, cb.getValor());
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            while (true) {
                System.out.println("Digite S para escolher outra opção ou N para encerrar.");
                r = sc.next();
                if (r.equalsIgnoreCase("S") || r.equalsIgnoreCase("N")) {
                    break;
                } else {
                    System.out.println("Opção inválida! Tente novamente.");
                }
            }
        } while (r.equalsIgnoreCase("S"));
        System.out.println("Programa encerrado.");
        sc.close();
    }
}