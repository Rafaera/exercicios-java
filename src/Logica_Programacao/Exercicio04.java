// Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

package Logica_Programacao;

import java.util.Scanner;

import static java.lang.Math.decrementExact;
import static java.lang.Math.incrementExact;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        int antecessor = decrementExact(numero);
        System.out.println("Antecessor: " + antecessor);

        int sucessor = incrementExact(numero);
        System.out.println("Sucessor: " + sucessor);

        input.close();
    }
}