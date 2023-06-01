package cursoUdemyJava.section14.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import cursoUdemyJava.section14.exercise2.entities.Company;
import cursoUdemyJava.section14.exercise2.entities.Individual;
import cursoUdemyJava.section14.exercise2.entities.TaxPayer;

public class Main {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    List<TaxPayer> list = new ArrayList<>();

    System.out.print("Enter the number of tax payers: ");
    int n = sc.nextInt();

    for (int index = 1; index <= n; index++) {
      System.out.println("Tax payer #" + index + " data:");
      System.out.print("Individual or company (i/c)? ");
      char option = sc.next().charAt(0);

      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();

      System.out.print("Anual income: ");
      double anualIncome = sc.nextDouble();

      if (option == 'i') {
        System.out.print("Health expenditures: ");
        double healthExpenditures = sc.nextDouble();
        TaxPayer individual = new Individual(name, anualIncome, healthExpenditures);
        list.add(individual);
      } else {
        System.out.print("Number of employees: ");
        int numberEmployees = sc.nextInt();
        TaxPayer company = new Company(name, anualIncome, numberEmployees);
        list.add(company);
      }
    }
    double sum = 0.0;
    for (TaxPayer payer : list) {
      System.out.printf("%s: $ %.2f%n", payer.getName(), payer.tax());
      sum += payer.tax();
    }
    System.out.println();
    System.out.printf("TOTAL TAXES: $ %.2f", sum);

    sc.close();

  }

}
