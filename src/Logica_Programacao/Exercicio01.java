// Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B e mostre se a soma é menor que C.

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner valorA = new Scanner(System.in);
        System.out.print("Digite o valor A: ");
        double A = valorA.nextDouble();

        Scanner valorB = new Scanner(System.in);
        System.out.print("Digite o valor B: ");
        double B = valorB.nextDouble();

        Scanner valorC = new Scanner(System.in);
        System.out.print("Digite o valor C: ");
        double C = valorC.nextDouble();

        double soma = A + B;

        if (soma < C) {
            System.out.println("O resultado da soma de A + B é: " + soma + ". \nE o valor da soma é menor que o valor de C.");
        } else {
            System.out.println("O resultado da soma de A + B é: " + soma + ". \nE o valor da soma NÃO é menor que o valor de C.");
        }
    }
}
