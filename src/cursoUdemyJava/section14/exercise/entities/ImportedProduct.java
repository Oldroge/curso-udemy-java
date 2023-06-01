package cursoUdemyJava.section14.exercise.entities;

import java.text.DecimalFormat;

public class ImportedProduct extends Product {
  private double customsFee;

  public ImportedProduct() {
    super();
  }

  public ImportedProduct(String name, double price, double customsFee, DecimalFormat df) {
    super(name, price, df);
    this.customsFee = customsFee;
  }

  public double getCustomsFee() {
    return customsFee;
  }

  public void setCustomsFee(double customsFee) {
    this.customsFee = customsFee;
  }

  public double totalPrice() {
    return super.getPrice() + this.customsFee;
  }

  @Override
  public String priceTag() {
    return "$ " + super.getDf().format(this.totalPrice()) + "(Customs fee: $" + this.customsFee
        + ")";
  }

}
