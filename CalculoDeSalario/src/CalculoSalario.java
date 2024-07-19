import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CalculoSalario {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("#============CÁLCULO DE SALÁRIO============#");
    System.out.println("Informe o primeiro salário:");
    double salario1 = scanner.nextDouble();
    System.out.println("Informe o segundo salário:");
    double salario2 = scanner.nextDouble();
    System.out.println("Informe o terceiro salário:");
    double salario3 = scanner.nextDouble();
    System.out.println("Informe o quarto salário:");
    double salario4 = scanner.nextDouble();
    System.out.println("Informe o quinto salário:");
    double salario5 = scanner.nextDouble();

    imprimirInformaco(salario1);
    System.out.println("#========================#");
    imprimirInformaco(salario2);
    System.out.println("#========================#");
    imprimirInformaco(salario3);
    System.out.println("#========================#");
    imprimirInformaco(salario4);
    System.out.println("#========================#");
    imprimirInformaco(salario5);

    }
    public static double calcularINSS(double salario){
        if(salario <= 1221){
            return salario * 0.075;
        }
        if(salario>=1221.01 && salario<=2427.35){
            return salario * 0.09;
        }
        if(salario>=2427.36 && salario<=3641.03){
            return salario * 0.12;
        }
        return salario * 0.14;
    }
    public static double calcularImpostoDeRenda(double salario){
        if(salario <= 1903.98){
            return 0;
        }
        if(salario>=1903.99 && salario<=2826.65){
            return salario * 0.075;
        }
        if(salario>=2826.26 && salario<=3751.05){
            return salario * 0.15;
        }
        if (salario>=3751.06 && salario<=4664.68){
            return salario * 0.225;
        }else{
            return salario * 0.275;
        }

    }
    public static double calcularSalarioLiquido(double salario, double descontos){
        return salario-descontos;
    }

    public static void imprimirInformaco(double salario){
        System.out.println("Sálario bruto: " + salario);
        System.out.println("Desconto INSS: " + calcularINSS(salario));
        System.out.println("Imposto de renda: " + calcularImpostoDeRenda(salario));
        System.out.println("Salário líquido: " + calcularSalarioLiquido(salario,(calcularINSS(salario)+calcularImpostoDeRenda(salario))));
    }
}