package cursoUdemyJava.section14.exercise;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import cursoUdemyJava.section14.exercise.entities.ImportedProduct;
import cursoUdemyJava.section14.exercise.entities.Product;
import cursoUdemyJava.section14.exercise.entities.UsedProduct;

public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of products: ");
    int n = sc.nextInt();
    List<Product> lista = new ArrayList<>();
    for (int index = 1; index <= n; index++) {
      System.out.println("Product #" + index + " data");
      System.out.print("Common, used or imported (c/u/i)? ");
      char option = sc.next().charAt(0);

      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();

      System.out.print("Price: ");
      double price = sc.nextDouble();

      if (option == 'i') {
        System.out.print("Customs fee: ");
        double customsFee = sc.nextDouble();
        Product produtoImportado =
            new ImportedProduct(name, price, customsFee, new DecimalFormat("#0.00"));
        lista.add(produtoImportado);
      } else if (option == 'u') {
        System.out.print("Manufacture date (DD/MM/YYYY): ");
        sc.nextLine();
        LocalDate manufactureDate = LocalDate.parse(sc.nextLine(), formatter);
        Product produtoUsado =
            new UsedProduct(name, price, manufactureDate, new DecimalFormat("#0.00"));
        lista.add(produtoUsado);
      } else {
        Product produto = new Product(name, price, new DecimalFormat("#0.00"));
        lista.add(produto);
      }
    }

    for (Product produto : lista) {
      System.out.println(produto.getName() + " " + produto.priceTag());
    }
    sc.close();
  }

}
