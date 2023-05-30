package cursoUdemyJava.section13.exercicioResolvido.entites;

import java.util.ArrayList;
import java.util.List;
import cursoUdemyJava.section13.exercicioResolvido.entites.enums.WorkerLevel;

public class Worker {
  private String name;
  private WorkerLevel level;
  private double baseSalary;
  private Department department;
  private List<HourContract> contracts = new ArrayList<>();

  public Worker() {}

  public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
    this.name = name;
    this.level = level;
    this.baseSalary = baseSalary;
    this.department = department;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkerLevel getLevel() {
    return level;
  }

  public void setLevel(WorkerLevel level) {
    this.level = level;
  }

  public double getBaseSalary() {
    return baseSalary;
  }

  public void setBaseSalary(double baseSalary) {
    this.baseSalary = baseSalary;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public List<HourContract> getContracts() {
    return contracts;
  }

  public void addContract(HourContract contract) {
    this.contracts.add(contract);
  }

  public void removeContract(HourContract contract) {
    this.contracts.remove(contract);
  }

  public double income(int year, int month) {
    double sum = this.baseSalary;
    for (HourContract contract : contracts) {
      int getMonth = contract.getDate().getMonthValue();
      int getYear = contract.getDate().getYear();

      if (getMonth == month && getYear == year) {
        sum += contract.totalValue();
      }
      return sum;
    }
    return sum;
  }
}
