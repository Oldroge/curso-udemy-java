package cursoUdemyJava.section14.exercicioResolvido;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import cursoUdemyJava.section14.exercicioResolvido.entities.Employee;
import cursoUdemyJava.section14.exercicioResolvido.entities.OutsourceEmployee;

public class Main {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Employee> list = new ArrayList<>();
    System.out.print("Enter the number of employees: ");

    int n = sc.nextInt();

    for (int index = 0; index < n; index++) {
      System.out.println("Employee #" + index + " data: ");
      System.out.print("Outsourced (y/n)? ");
      char ch = sc.next().charAt(0);

      System.out.print("Name: ");
      sc.nextLine();
      String nome = sc.nextLine();

      System.out.print("Hours: ");
      int hours = sc.nextInt();

      System.out.print("Value Per hour: ");
      double valuePerHour = sc.nextDouble();

      if (ch == 'y') {
        System.out.print("Additional charge: ");
        double additionalCharge = sc.nextDouble();
        Employee emp = new OutsourceEmployee(nome, hours, valuePerHour, additionalCharge);
        list.add(emp);
      } else {
        Employee emp = new Employee(nome, hours, valuePerHour);
        list.add(emp);
      }
    }
    System.out.println();
    System.out.println("PAYMENTS:");

    for (Employee emp : list) {
      System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
    }
    sc.close();
  }

}
