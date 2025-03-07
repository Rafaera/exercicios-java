// Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class Exercicio02 {

    public static String numeroParOuImpar(int num) {

        if (num % 2 == 0) {
            return "Esse número é par!";
        } else {
            return "Esse número é ímpar!";
        }
    }

    public static String numeroPositivoOuNegativo(int num) {

        if (num > 0) {
            return "E é um número positivo!";
        } else if (num < 0) {
            return "E é um número negativo!";
        } else {
            return "E esse número é 0!";
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        System.out.println(numeroParOuImpar(numero));
        System.out.println(numeroPositivoOuNegativo(numero));

        input.close();
    }
}
