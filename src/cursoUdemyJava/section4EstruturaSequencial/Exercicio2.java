package cursoUdemyJava.section4EstruturaSequencial;

import java.util.Scanner;

/**
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste
 * círculo com quatro casas decimais conforme exemplos. Fórmula da área: area = π . raio2 Considere
 * o valor de π = 3.14159
 *
 */

public class Exercicio2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double pi = 3.14159;

    double raio2 = sc.nextDouble();

    double area = pi * Math.pow(raio2, 2);

    System.out.printf("A=%.4f%n", area);

    boolean test = sc.hasNext();
    System.out.println(test);

    sc.close();
  }

}
