package cursoUdemyJava.section14.exercise.entities;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class UsedProduct extends Product {
  private LocalDate manufactureDate;

  public UsedProduct() {
    super();
  }

  public UsedProduct(String name, double price, LocalDate manufactureDate, DecimalFormat df) {
    super(name, price, df);
    this.manufactureDate = manufactureDate;
  }

  public LocalDate getManufactureDate() {
    return manufactureDate;
  }

  public void setManufactureDate(LocalDate manufactureDate) {
    this.manufactureDate = manufactureDate;
  }


  @Override
  public String priceTag() {
    return "(used) $ " + getDf().format(super.getPrice()) + " (Manufacture date: "
        + this.manufactureDate + ")";
  }

}
