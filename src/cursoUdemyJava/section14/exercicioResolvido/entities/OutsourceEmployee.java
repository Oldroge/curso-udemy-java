package cursoUdemyJava.section14.exercicioResolvido.entities;

public class OutsourceEmployee extends Employee {
  private double additionalCharger;

  public OutsourceEmployee() {
    super();
  }

  public OutsourceEmployee(String name, int hours, double valuePerHour, Double additionalCharger) {
    super(name, hours, valuePerHour);
    this.additionalCharger = additionalCharger;
  }

  public double getAdditionalCharger() {
    return additionalCharger;
  }

  public void setAdditionalCharger(double additionalCharger) {
    this.additionalCharger = additionalCharger;
  }

  @Override
  public double payment() {
    return super.payment() + this.additionalCharger * 1.1;
  }

}
