/*
4. Dado um vetor de números reais, fazer um programa que imprima o menor elemento do vetor.
 */
package listaVetor;

import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class VetorExer4 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o tamanho de vetor: ");
        int n = sc.nextInt();

        double vetor[] = new double[n];

        double maior = 0;
        double menor = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                menor = maior;

                for (int j = 0; j < vetor.length; j++) {
                    if (vetor[j] < maior) {
                        menor = vetor[j];
                    }
                }
            }
        }
        System.out.println("O menor elemento é: " + menor);
    }
}
