package cursoUdemyJava.section10.matrizes.exercise4;

import java.util.Scanner;

/**
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
 * tela todos os números pares, e também a quantidade de números pares.
 */

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantos numeros você vai digitar? ");
    int n = sc.nextInt();

    int[] numeros = new int[n];

    for (int index = 0; index < numeros.length; index++) {
      System.out.print("Digite um numero: ");
      int numeroEscolhido = sc.nextInt();

      numeros[index] = numeroEscolhido;
    }

    System.out.println("NUMEROS PARES:");
    int contaPares = 0;
    for (int numero : numeros) {
      if (numero % 2 == 0) {
        contaPares++;
        System.out.print(numero + " ");
      }
    }
    System.out.println();
    System.out.print("QUANTIDADE DE PARES = " + contaPares);
    sc.close();

  }

}
