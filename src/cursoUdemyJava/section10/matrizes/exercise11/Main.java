package cursoUdemyJava.section10.matrizes.exercise11;

import java.util.Locale;
import java.util.Scanner;

/**
 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
 * que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o
 * número de homens.
 */

public class Main {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantas pessoas serão digitadas? ");
    int n = sc.nextInt();
    double[] alturas = new double[n];
    char[] generos = new char[n];

    for (int index = 0; index < n; index++) {
      System.out.print("Altura da " + (index + 1) + "º pessoa: ");
      double altura = sc.nextDouble();

      System.out.print("Gênero da " + (index + 1) + "º pessoa: ");
      char genero = sc.next().toUpperCase().charAt(0);

      alturas[index] = altura;
      generos[index] = genero;
    }
    double menorAltura = alturas[0];
    for (double altura : alturas) {
      if (menorAltura > altura) {
        menorAltura = altura;
      }

    }
    System.out.print("Menor altura = ");
    System.out.println(menorAltura);

    double maiorAltura = 0.0;
    for (double altura : alturas) {
      if (altura > maiorAltura) {
        maiorAltura = altura;
      }
    }
    System.out.print("Maior altura = ");
    System.out.println(maiorAltura);

    double somaAlturaMulheres = 0.0;
    int numeroDeMulheres = 0;
    int numeroDeHomens = 0;
    for (int index = 0; index < generos.length; index++) {
      if (generos[index] == 'F') {
        somaAlturaMulheres += alturas[index];
        numeroDeMulheres++;
      } else {
        numeroDeHomens++;
      }
    }

    System.out.print("Media das alturas das mulheres = ");
    double media = somaAlturaMulheres / numeroDeMulheres;
    System.out.printf("%.2f\n", media);

    System.out.print("Numero de homens = ");
    System.out.println(numeroDeHomens);


    sc.close();

  }

}
