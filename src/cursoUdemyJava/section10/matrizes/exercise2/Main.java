package cursoUdemyJava.section10.matrizes.exercise2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida: - Imprimir todos
 * os elementos do vetor - Mostrar na tela a soma e a média dos elementos do vetor
 */

public class Main {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantos numeros você vai digitar? ");
    int n = sc.nextInt();
    double[] numeros = new double[n];

    for (int index = 0; index < numeros.length; index++) {
      System.out.print("Digite um numero: ");
      numeros[index] = sc.nextDouble();
    }

    double sum = 0.0;
    System.out.print("VALORES: ");
    for (double numero : numeros) {
      System.out.print(numero + " ");
      sum += numero;
    }
    double average = sum / numeros.length;
    System.out.println();
    System.out.println("SOMA: " + sum);
    System.out.println("MEDIA: " + average);
    sc.close();

  }

}
