package cursoUdemyJava.section4EstruturaSequencial;

import java.util.Scanner;

/**
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números
 * com uma mensagem explicativa, conforme exemplos.
 *
 */

public class Exercicio1 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int y = sc.nextInt();

    System.out.println("SOMA = " + (x + y));

    sc.close();

  }

}
