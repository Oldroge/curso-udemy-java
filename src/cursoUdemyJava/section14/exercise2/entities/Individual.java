package cursoUdemyJava.section14.exercise2.entities;

public class Individual extends TaxPayer {

  private double healthExpenditures;


  public Individual() {
    super();
  }

  public Individual(String name, double anualIncome, double healthExpenditures) {
    super(name, anualIncome);
    this.healthExpenditures = healthExpenditures;
  }

  public double getHealthExpenditures() {
    return healthExpenditures;
  }

  public void setHealthExpenditures(double healthExpenditures) {
    this.healthExpenditures = healthExpenditures;
  }

  @Override
  public double tax() {
    if (super.getAnualIncome() < 20000.00) {
      return (super.getAnualIncome() * 15 / 100) - (this.getHealthExpenditures() * 50 / 100);
    }
    return (super.getAnualIncome() * 25 / 100) - (this.getHealthExpenditures() * 50 / 100);
  }


}
