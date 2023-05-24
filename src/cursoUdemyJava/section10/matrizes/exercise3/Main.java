package cursoUdemyJava.section10.matrizes.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import cursoUdemyJava.section10.matrizes.exercise3.entities.Pessoa;

/**
 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar
 * na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16
 * anos, bem como os nomes dessas pessoas caso houver.
 */

public class Main {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantas pessoas serão digitadas? ");
    int n = sc.nextInt();
    List<Pessoa> pessoas = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      System.out.println("Dados da " + (i + 1) + "ª pessoa:");
      System.out.print("Nome: ");
      sc.nextLine();
      String nome = sc.nextLine();

      System.out.print("Idade: ");
      int idade = sc.nextInt();

      System.out.print("Altura: ");
      double altura = sc.nextDouble();

      Pessoa novaPessoa = new Pessoa(nome, idade, altura);
      pessoas.add(novaPessoa);
    }

    double sumAltura = 0.0;
    List<Pessoa> nomePessoaMenorDezesseis = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      sumAltura += pessoas.get(i).getAltura();
      if (pessoas.get(i).getIdade() < 16) {
        nomePessoaMenorDezesseis.add(pessoas.get(i));
      }
    }
    System.out.println(sumAltura);
    double mediaAltura = sumAltura / pessoas.size();
    System.out.print("Altura média: ");
    System.out.printf("%.2f\n", mediaAltura);

    double pessoaMenor = nomePessoaMenorDezesseis.size();
    double tamanhoDaLista = pessoas.size();
    double menorDeDezesseis = ((pessoaMenor / tamanhoDaLista) * 100);
    System.out.print("Pessoas com menos de 16 anos: ");
    System.out.print(menorDeDezesseis + "%");

    for (Pessoa nome : nomePessoaMenorDezesseis) {
      System.out.println(nome.getNome());
    }



    sc.close();
  }

}
