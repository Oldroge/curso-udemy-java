package cursoUdemyJava.section10.vetores.exercises.somaVetores;

import java.util.Locale;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantos numeros você vai digitar?");
    int n = sc.nextInt();
    double[] numeros = new double[n];
    double sum = 0.0;
    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Digite um numero: ");
      numeros[i] = sc.nextDouble();
    }

    System.out.print("VALORES = ");
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i] + " ");
      sum += numeros[i];
    }
    System.out.println();
    System.out.println("SOMA = " + sum);
    System.out.println("MEDIA = " + (sum / numeros.length));
    sc.close();


  }

}
