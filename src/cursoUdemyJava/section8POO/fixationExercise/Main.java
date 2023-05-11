package cursoUdemyJava.section8POO.fixationExercise;

import java.util.Locale;
import java.util.Scanner;
import cursoUdemyJava.section8POO.fixationExercise.util.CurrencyConverter;

/**
 * Faça um programa para a ler a contação do dólar, e depois um valor em dólares a ser comprado por
 * uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
 * que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
 * para ser responsável pelos cálculos.
 */

public class Main {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("What is the dollar price? ");
    double dollarPrice = sc.nextDouble();

    System.out.print("how many dollars will be bought? ");
    double bought = sc.nextDouble();

    double result = CurrencyConverter.converter(dollarPrice, bought);

    System.out.printf("Amout to be paid in reais = %.2f%n", result);

  }

}
