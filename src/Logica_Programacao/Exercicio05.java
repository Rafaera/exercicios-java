/* Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários * mínimos esse usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo: R$ 1.518 (2025)).
 */

package Logica_Programacao;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        double salarioMinimo2025 = 1518;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu salário: ");
        double salario = input.nextDouble();

        double resultado = salario / salarioMinimo2025;
        int resultadoInt = (int) resultado;

        System.out.printf("Você ganha %.2f salários mínimos.%n", resultado);

        input.close();
    }
}