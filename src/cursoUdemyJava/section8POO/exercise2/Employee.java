package cursoUdemyJava.section8POO.exercise2;

public class Employee {
  private String name;
  private double GrossSalary;
  private double tax;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getGrossSalary() {
    return GrossSalary;
  }

  public void setGrossSalary(double grossSalary) {
    GrossSalary = grossSalary;
  }

  public double getTax() {
    return tax;
  }

  public void setTax(double tax) {
    this.tax = tax;
  }

  public double netSalary() {
    double recalculateSalary = this.GrossSalary - this.tax;
    this.setGrossSalary(recalculateSalary);
    return this.getGrossSalary();
  }

  public String toString() {
    return "Employee: " + this.getName() + ", " + "$ " + this.netSalary();
  }

  public void increaseSalary(double percentageIncrease) {
    this.setGrossSalary(this.getGrossSalary() + (this.getGrossSalary() * percentageIncrease / 100));

  }



}
