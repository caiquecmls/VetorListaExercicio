/*
2. Dado um vetor de números reais, fazer um programa que some todos os elementos do vetor e imprima o
resultado.
 */
package listaVetor;

import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class VetorExer2 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();

        double vetor[] = new double[n];

        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextDouble();
        }

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.println(soma);
    }
}
