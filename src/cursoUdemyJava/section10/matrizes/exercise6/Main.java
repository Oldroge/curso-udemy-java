package cursoUdemyJava.section10.matrizes.exercise6;

import java.util.Scanner;

/**
 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
 * terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
 * o vetor C gerado.
 */

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantos valores vai ter cada vetor? ");
    int n = sc.nextInt();
    int[] A = new int[n];
    int[] B = new int[n];
    int[] C = new int[n];

    System.out.println("Digite os valores do vetor A:");
    for (int index = 0; index < A.length; index++) {
      int valoresA = sc.nextInt();
      A[index] = valoresA;
    }

    System.out.println("Digite os valores do vetor B:");
    for (int index = 0; index < B.length; index++) {
      int valoresB = sc.nextInt();
      B[index] = valoresB;
    }

    int[] somaVetores = new int[n];
    for (int index = 0; index < C.length; index++) {
      somaVetores[index] = A[index] + B[index];
    }
    System.out.println("VETOR RESULTANTE:");
    for (int soma : somaVetores) {
      System.out.println(soma);
    }

    sc.close();

  }

}
