package cursoUdemyJava.section14.exercise2.entities;

public class Company extends TaxPayer {
  private int numberOfEmployees;

  public Company() {
    super();
  }

  public Company(String name, double anualIncome, int numberOfEmployees) {
    super(name, anualIncome);
    this.numberOfEmployees = numberOfEmployees;
  }

  public int getNumberOfEmployees() {
    return numberOfEmployees;
  }

  public void setNumberOfEmployees(int numberOfEmployees) {
    this.numberOfEmployees = numberOfEmployees;
  }

  @Override
  public double tax() {
    if (this.numberOfEmployees > 10) {
      return super.getAnualIncome() * (14 / 100);
    }
    return super.getAnualIncome() * (16 / 100);
  }
}
