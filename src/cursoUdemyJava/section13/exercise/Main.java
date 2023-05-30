package cursoUdemyJava.section13.exercise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import cursoUdemyJava.section13.exercise.entities.Client;
import cursoUdemyJava.section13.exercise.entities.Order;
import cursoUdemyJava.section13.exercise.entities.OrderItem;
import cursoUdemyJava.section13.exercise.entities.Product;
import cursoUdemyJava.section13.exercise.entities.utils.OrderStatus;

public class Main {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter cliente data:");
    System.out.print("Name: ");
    String name = sc.nextLine();

    System.out.print("Email: ");
    String email = sc.nextLine();

    System.out.print("Birth date (DD/MM/YYYY): ");
    LocalDate birthDate = LocalDate.parse(sc.nextLine(), formatter);

    Client client = new Client(name, email, birthDate);

    System.out.println();
    System.out.println("Enter Order data: ");
    System.out.print("Status: ");
    String status = sc.nextLine();
    Order order = new Order(LocalDate.now(), OrderStatus.valueOf(status), client);

    System.out.print("How many items to this order? ");
    int items = sc.nextInt();

    for (int i = 1; i <= items; i++) {
      System.out.println("Enter #" + i + " item data:");
      System.out.print("Product name: ");
      sc.nextLine();
      String productName = sc.nextLine();

      System.out.print("Product price: ");
      double productPrice = sc.nextDouble();

      System.out.print("Quantity: ");
      int productQuantity = sc.nextInt();

      Product product = new Product(productName, productPrice);
      OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
      order.addItem(orderItem);
    }

    System.out.println("ORDER SUMARY: ");
    System.out.println(order);



    sc.close();

  }

}
