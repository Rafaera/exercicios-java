/* Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois
 * valores, caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o
 * resultado a uma variável C e imprimir seu valor na tela.
 */

package Logica_Programacao;

import java.util.Scanner;

public class Exercicio03 {

    public static int checarOsValores(int valorA, int valorB) {
        if (valorA == valorB) {
            return valorA + valorB;
        } else {
            return valorA * valorB;
        }
    }

    public static void main(String[] args) {

        Scanner valorA = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int a = valorA.nextInt();

        Scanner valorB = new Scanner(System.in);
        System.out.print("Digite o segundo número inteiro: ");
        int b = valorB.nextInt();

        int c = checarOsValores(a, b);
        System.out.println("Resultado: " + c);

        valorA.close();
        valorB.close();
    }
}