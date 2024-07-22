
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        double num1, num2, resultado;
        char operador;


        System.out.println("BEM VINDO A CALCULADORA");
        System.out.println("Escolha com qual operação vai realizar sua conta");
        System.out.println("Clique + para soma");
        System.out.println("Clique - para subtração");
        System.out.println("Clique * para multiplicação");
        System.out.println("Clique / para divisão");

        System.out.println("DIGITE A OPÇÃO DESEJADA: ");
        operador = scanner.next().charAt(0);

        System.out.println("Agora que você ja escolheu o operador, digite os números que você quer realizar a operação.");
        System.out.println("Digite um número: ");
        num1 = scanner.nextDouble();
        System.out.println("Digite o outro número: ");
        num2 = scanner.nextDouble();

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '/':
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
                break;

            default:
                System.out.println("Operador inválido!");

        }
        scanner.close();


    }
}