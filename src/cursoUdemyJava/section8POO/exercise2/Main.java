package cursoUdemyJava.section8POO.exercise2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
 * seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o salário
 * do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela
 * porcentagem) e mostrar novamente os dados do funcionário. Use a classe projetada abaixo.
 */

public class Main {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Employee employee = new Employee();

    System.out.print("Name: ");
    String nome = sc.next();
    System.out.print("Gross Salary: ");
    double grossSalary = sc.nextDouble();
    System.out.print("Tax: ");
    double tax = sc.nextDouble();
    employee.setName(nome);
    employee.setGrossSalary(grossSalary);
    employee.setTax(tax);
    System.out.println(employee);

    System.out.print("Which percentage to increase salary? ");

    double percentageIncrease = sc.nextDouble();

    employee.increaseSalary(percentageIncrease);

    System.out.println("Updated data: " + employee.getName() + ", $" + employee.getGrossSalary());

  }

}
