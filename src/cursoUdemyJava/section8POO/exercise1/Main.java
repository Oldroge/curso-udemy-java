package cursoUdemyJava.section8POO.exercise1;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na
 * tela o valor de sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto ao lado.
 */

public class Main {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter rectangle width and height: ");
    double width = sc.nextDouble();
    double height = sc.nextDouble();

    System.out.printf("AREA: %.2f%n", Rectangle.area(width, height));
    System.out.printf("PERIMETER: %.2f%n", Rectangle.perimeter(width, height));
    System.out.printf("DIAGONAL: %.2f%n", Rectangle.diagonal(width, height));

    sc.close();

  }

}
