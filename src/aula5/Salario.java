package aula5;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        double salario;
        double resultado;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salario");
        salario = entrada.nextDouble();

        resultado = (salario <= 2000) ? salario*1.15 : salario*1.10;
        System.out.println("O salario final = " + resultado);
    }
}