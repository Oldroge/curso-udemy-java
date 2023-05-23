package cursoUdemyJava.section10.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import cursoUdemyJava.section10.listas.entities.Funcionarios;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    List<Funcionarios> funcLista = new ArrayList<>();
    System.out.print("How many employees will be registered? ");
    int employees = sc.nextInt();

    for (int index = 0; index < employees; index++) {
      System.out.println("Employee #" + (index + 1));
      System.out.print("Id: ");
      int id = sc.nextInt();

      sc.nextLine();
      System.out.print("Name: ");
      String name = sc.nextLine();

      System.out.print("Salary: ");
      double salary = sc.nextDouble();

      Funcionarios funcionarios = new Funcionarios(id, name, salary);
      funcLista.add(funcionarios);
    }

    System.out.print("Enter the employee id that will have salary increase: ");
    int idSalaryToIncrease = sc.nextInt();
    List<Funcionarios> getById =
        funcLista.stream().filter(funcionarios -> funcionarios.getId() == idSalaryToIncrease)
            .collect(Collectors.toList());

    if (getById.size() == 0) {
      System.out.println("This id does not exist!");
      System.out.println();
      System.out.println("List of employees: ");
      for (Funcionarios funcionario : funcLista) {
        System.out.println(funcionario);
      }
    } else {

      System.out.print("Enter the percentage: ");
      int percentageToIncrease = sc.nextInt();

      getById.get(0).increaseSalary(percentageToIncrease);

      System.out.println("List of employees: ");

      for (Funcionarios funcionario : funcLista) {
        System.out.println(funcionario);
      }
    }



    sc.close();


  }

}
