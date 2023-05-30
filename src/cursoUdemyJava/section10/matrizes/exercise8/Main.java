package cursoUdemyJava.section10.matrizes.exercise8;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
 * aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
 * digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 */

public class Main {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantos elementos vai ter o vetor? ");
    int n = sc.nextInt();
    int[] numeros = new int[n];

    int tamanhoListaPares = 0;
    for (int index = 0; index < numeros.length; index++) {
      System.out.print("Digite um numero: ");
      int numeroEscolhido = sc.nextInt();
      numeros[index] = numeroEscolhido;
      if (numeros[index] % 2 == 0) {
        tamanhoListaPares++;
      }
    }
    int[] numerosPares = new int[tamanhoListaPares];
    if (numerosPares.length == 0) {
      System.out.println("NENHUM NUMERO PAR");
    } else {
      int soma = 0;
      int indexPar = 0;
      for (int index = 0; index < numeros.length; index++) {
        if (numeros[index] % 2 == 0) {
          numerosPares[indexPar] = numeros[index];
          soma += numeros[index];
          indexPar++;
        }
      }
      double mediaPares = soma / numerosPares.length;

      System.out.print("MEDIA DOS PARES = " + mediaPares);

    }


    sc.close();

  }

}
