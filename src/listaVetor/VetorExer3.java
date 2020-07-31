/*
3. Dado um vetor de números inteiros, fazer um programa que imprima o maior elemento do vetor.
 */
package listaVetor;

import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class VetorExer3 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();

        int vetor[] = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
        int maior = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];

            }
        }
        System.out.printf("O maior elemento é: %d", maior);
    }
}
