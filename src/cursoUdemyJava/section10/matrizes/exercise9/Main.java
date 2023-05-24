package cursoUdemyJava.section10.matrizes.exercise9;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
 * devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
 * da pessoa mais velha.
 */

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantas pessoas você vai digitar? ");
    int n = sc.nextInt();
    String[] pessoasNome = new String[n];
    int[] pessoasIdade = new int[n];

    for (int index = 0; index < n; index++) {
      System.out.println("Dados da " + (index + 1) + "ª pessoa:");
      sc.nextLine();
      System.out.print("Nome: ");
      pessoasNome[index] = sc.nextLine();
      System.out.print("Idade: ");
      pessoasIdade[index] = sc.nextInt();
    }

    int maiorIdade = 0;
    for (int idade : pessoasIdade) {
      if (idade > maiorIdade) {
        maiorIdade = idade;
      }
    }

    int indice = Arrays.binarySearch(pessoasIdade, maiorIdade);


    System.out.print("PESSOA MAIS VELHA: ");
    System.out.println(pessoasNome[indice]);



    sc.close();

  }

}
