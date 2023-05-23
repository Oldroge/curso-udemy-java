package cursoUdemyJava.section10.vetores.exercises.negativos;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Quantos números você vai digitar? ");
    int n = sc.nextInt();
    int[] inteiros = new int[n];
    for (int i = 0; i < inteiros.length; i++) {
      inteiros[i] = sc.nextInt();
    }

    System.out.println("NUMEROS NEGATIVOS:");
    for (int i = 0; i < inteiros.length; i++) {
      if (inteiros[i] < 0) {
        System.out.println(inteiros[i]);
      }
    }

    sc.close();
  }

}
