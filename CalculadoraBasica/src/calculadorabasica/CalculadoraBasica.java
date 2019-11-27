package calculadorabasica;

import java.util.Scanner;

/**
 *
 * @author Intruder
 */
public class CalculadoraBasica {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double b = s.nextDouble();
        System.out.println("Digite o segundo número:");
        double a = s.nextDouble();
        System.out.println("Informe o número da operação");
        System.out.println("1 - SOMARn"
                + "2 - SUBTRAÇÃO\n"
                + "3 - MULTIPLICAÇÃO\n"
                + "4 - DIVISÃO");
        int op=s.nextInt();
    }

}
