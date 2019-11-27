package calculadorabasica;

import java.util.Scanner;

/**
 *
 * @author Intruder
 */
public class CalculadoraBasica {
    
    public static void menu(){
        System.out.println("1 - SOMARn"
                + "2 - SUBTRAÇÃO\n"
                + "3 - MULTIPLICAÇÃO\n"
                + "4 - DIVISÃO");
    }
    
    public static void main(String[] args) {
        
        /* Calculadora com as quatro operações básicas */
        
        
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double a = s.nextDouble();
        System.out.println("Digite o segundo número:");
        double b = s.nextDouble();
        System.out.println("Informe o número da operação");
        menu();
        int op=s.nextInt();
        
        switch(op){
            case 1:
                System.out.println(Conta.somar(a, b));
                break;
            case 2:
                System.out.println(Conta.diminuir(a, b));
                break;
            case 3:
                System.out.println(Conta.multiplicar(a, b));
                break;
            case 4:
                System.out.println(Conta.dividir(a, b));
        }
    }

}
