import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
Entrada:
10
30
SOMA = 40 */
    Scanner sc = new Scanner(System.in);
    System.out.println("Soma de dois números");

    System.out.println("Digite um numero:");
    int numero1 = sc.nextInt();

    System.out.println("Digite outro número:");
    int numero2 = sc.nextInt();

    int resultado = numero1 + numero2;

    System.out.println("O resultado da soma dos dois numero são: " + numero1 + " + " + numero2 + " = " + resultado);
    
    }
}
