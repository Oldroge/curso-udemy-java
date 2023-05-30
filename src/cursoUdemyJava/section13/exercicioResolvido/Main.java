package cursoUdemyJava.section13.exercicioResolvido;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import cursoUdemyJava.section13.exercicioResolvido.entites.Department;
import cursoUdemyJava.section13.exercicioResolvido.entites.HourContract;
import cursoUdemyJava.section13.exercicioResolvido.entites.Worker;
import cursoUdemyJava.section13.exercicioResolvido.entites.enums.WorkerLevel;

public class Main {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    System.out.print("Enter department's name: ");
    String departmentName = sc.next();
    System.out.println("Enter worker data: ");
    System.out.print("Name: ");
    String workerName = sc.next();
    System.out.print("Level: ");
    String workerLevel = sc.next();
    System.out.print("BaseSalary: ");
    long baseSalary = sc.nextLong();


    Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
        new Department(departmentName));

    System.out.print("How many contracts to this worker? ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println("Enter contract number #" + i + " data:");
      System.out.print("Date (DD/MM/YYYY): ");
      LocalDate contractDate = LocalDate.parse(sc.next(), df);
      System.out.print("Value per hour: ");
      double valuePerHour = sc.nextDouble();
      System.out.println("Durations (hours): ");
      int hours = sc.nextInt();
      HourContract contract = new HourContract(contractDate, valuePerHour, hours);
      worker.addContract(contract);
    }

    System.out.println();
    System.out.println("Enter month and year to calculate income (MM/YYYY): ");
    String monthAndYear = sc.next();
    int month = Integer.parseInt(monthAndYear.substring(0, 2));
    int year = Integer.parseInt(monthAndYear.substring(3));
    System.out.println("Name: " + worker.getName());
    System.out.println("Department: " + worker.getDepartment().getName());
    System.out.print("Income for " + month + "/" + year + ": ");
    System.out.println(worker.income(year, month));

    sc.close();
  }

}
