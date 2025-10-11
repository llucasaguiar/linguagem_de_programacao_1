
public class Main {
    public static void main(String[] args) {
        double salarioBruto = 1800;
        double salarioLiquido;
        double ir;

        if (salarioBruto <= 900) {
            System.out.println("Isento do IR!");
        } else if (salarioBruto >= 901 && salarioBruto <= 1500) {
            ir = (salarioBruto * 5)/100;
            salarioLiquido = salarioBruto - ir;
            System.out.println("O salário bruto é de R$ " + salarioBruto + ", imposto cobrado de 5% é de R$ " + ir + ", obtendo o salário líquido de R$ " + salarioLiquido);
        } else if (salarioBruto >=1501 && salarioBruto <= 2500) {
            ir = (salarioBruto * 10)/100;
            salarioLiquido = salarioBruto - ir;
            System.out.println("O salário bruto é de R$ " + salarioBruto + ", imposto cobrado de 10% é de R$ " + ir + ", obtendo o salário líquido de R$ " + salarioLiquido);
        } else {
            ir = (salarioBruto * 20)/100;
            salarioLiquido = salarioBruto - ir;
            System.out.println("O salário bruto é de R$ " + salarioBruto + ", imposto cobrado de 20% é de R$ " + ir + ", obtendo o salário líquido de R$ " + salarioLiquido);
        }
    }
}