package cursoUdemyJava.section8POO.fixationExercise.util;

public class CurrencyConverter {
  public static double converter(double price, double bought) {
    double result = price * bought;
    return result + price * bought * 0.06;
  }

}
