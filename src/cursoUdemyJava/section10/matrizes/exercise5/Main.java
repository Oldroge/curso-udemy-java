package cursoUdemyJava.section10.matrizes.exercise5;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
 * o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
 * considerando a primeira posição como 0 (zero).
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
      double numeroEscolhido = sc.nextDouble();
      numeros[index] = numeroEscolhido;
    }

    double maiorNumero = 0.0;
    for (double numero : numeros) {
      if (numero > maiorNumero) {
        maiorNumero = numero;
      }
    }
    System.out.print("MAIOR VALOR = ");
    System.out.println(maiorNumero);

    for (int index = 0; index < numeros.length; index++) {
      if (numeros[index] == maiorNumero) {
        int indexMaiorNumero = index;
        System.out.print("POSICAO DO MAIOR VALOR = ");
        System.out.println(indexMaiorNumero);

      }
    }


    sc.close();

  }

}
