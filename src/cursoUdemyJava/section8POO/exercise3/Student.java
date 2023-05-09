package cursoUdemyJava.section8POO.exercise3;

public class Student {
  double primeiroTri;
  double segundoTri;
  double terceiroTri;
  String name;

  public double getPrimeiroTri() {
    return primeiroTri;
  }

  public void setPrimeiroTri(double primeiroTri) {
    this.primeiroTri = primeiroTri;
  }

  public double getSegundoTri() {
    return segundoTri;
  }

  public void setSegundoTri(double segundoTri) {
    this.segundoTri = segundoTri;
  }

  public double getTerceiroTri() {
    return terceiroTri;
  }

  public void setTerceiroTri(double terceiroTri) {
    this.terceiroTri = terceiroTri;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double mediaNota() {
    return this.getPrimeiroTri() + this.getSegundoTri() + this.getTerceiroTri();
  }

  public String toString() {
    if (this.mediaNota() > 60.0)
      return "FINAL GRADE: " + this.mediaNota();

    return "FINAL GRADE: " + this.mediaNota() + "\nFAILED\n" + "MISSING " + (60 - this.mediaNota())
        + " POINTS";
  }



}
