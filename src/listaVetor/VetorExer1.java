/*
1. Dado um vetor de números inteiros, fazer um programa que imprime todos os elementos do vetor
 */
package listaVetor;

import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class VetorExer1 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }

        System.out.print("elementos do vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + (" "));
        }
    }
}
