package cursoUdemyJava.section10.matrizes.exercise10;

import java.util.Locale;
import java.util.Scanner;
import cursoUdemyJava.section10.matrizes.exercise10.entities.Estudante;

/**
 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
 * no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois,
 * imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja
 * maior ou igual a 6.0 (seis).
 */

public class Main {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantos alunos serão digitados? ");
    int n = sc.nextInt();
    Estudante[] vetor = new Estudante[n];

    for (int index = 0; index < vetor.length; index++) {
      System.out.println("Digite o nome, primera e segunda nota do " + (index + 1) + "º aluno:");
      sc.nextLine();
      String nome = sc.nextLine();
      double primeiraNota = sc.nextDouble();
      double segundaNota = sc.nextDouble();

      Estudante estudante = new Estudante(nome, primeiraNota, segundaNota);
      vetor[index] = estudante;
    }


    System.out.println("Alunos aprovados:");
    for (Estudante estudante : vetor) {
      double media = (estudante.getPrimeiraNota() + estudante.getSegundaNota()) / 2;
      if (media >= 6.0) {
        System.out.println(estudante.getNome());
      }
    }

    sc.close();

  }

}
