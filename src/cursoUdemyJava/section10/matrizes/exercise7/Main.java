package cursoUdemyJava.section10.matrizes.exercise7;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
 * mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar
 * todos os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
 */

public class Main {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantos elementos vai ter um vetor? ");
    int n = sc.nextInt();
    double[] numeros = new double[n];

    for (int index = 0; index < numeros.length; index++) {
      System.out.print("Digite um numero: ");
      double numeroEscolhido = sc.nextDouble();
      numeros[index] = numeroEscolhido;
    }

    System.out.print("MEDIA VETOR = ");
    double somaNumeros = 0.0;
    for (double numero : numeros) {
      somaNumeros += numero;
    }
    double mediaNumeros = somaNumeros / numeros.length;
    System.out.println(mediaNumeros);

    System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
    for (double numero : numeros) {
      if (numero < mediaNumeros) {
        System.out.println(numero);
      }
    }
    sc.close();

  }

}
