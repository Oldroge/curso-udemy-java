package cursoUdemyJava.section14.exercise.entities;

import java.text.DecimalFormat;

public class Product {
  private String name;
  private double price;
  private DecimalFormat df;

  public Product() {}

  public Product(String name, double price, DecimalFormat df) {
    this.name = name;
    this.price = price;
    this.df = df;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public DecimalFormat getDf() {
    return df;
  }

  public String priceTag() {
    return "$ " + this.df.format(this.price);
  }
}
