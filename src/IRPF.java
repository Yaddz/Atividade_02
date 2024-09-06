import java.util.Scanner;

public class IRPF {
    private double salarioBruto;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IRPF irpf = new IRPF();

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu salário bruto: ");
        irpf.salarioBruto = scanner.nextDouble();

        double imposto = irpf.calcularImposto();
        double salarioLiquido = irpf.salarioBruto - imposto;
        System.out.println("O seu salario liquido é: " + salarioLiquido);
        System.out.print("O imposto a ser pago é: R$ " + imposto);

        scanner.close();
    }
    public double calcularImposto() {
        double imposto = 0;

        if (salarioBruto <= 2112){
            imposto = 0;
        } else if (salarioBruto <= 2826.65){
            imposto = salarioBruto * 0.075 - 142.80;
        } else if (salarioBruto <= 3751.05){
            imposto = salarioBruto * 0.15 - 354.80;
        }else if (salarioBruto <= 4664.68){
            imposto = salarioBruto * 0.225 - 636.13;
        }else imposto = salarioBruto * 0.275 - 636.13;

        return imposto;
    }
}