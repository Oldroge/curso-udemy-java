package cursoUdemyJava.section10.matrizes.exercise1;

import java.util.Scanner;

/**
 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
 * e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
 **/
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantos números você vai digitar? ");
    int n = sc.nextInt();
    int[] numeros = new int[n];

    for (int index = 0; index < numeros.length; index++) {
      System.out.print("Digite um numero: ");
      numeros[index] = sc.nextInt();
    }

    System.out.println("NUMEROS NEGATIVOS");
    for (int numero : numeros) {
      if (numero < 0) {
        System.out.println(numero);
      }
    }
    sc.close();

  }

}
