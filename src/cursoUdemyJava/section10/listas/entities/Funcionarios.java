package cursoUdemyJava.section10.listas.entities;

public class Funcionarios {
  private int id;
  private String nome;
  private double salario;

  public Funcionarios(int id, String nome, double salario) {
    this.id = id;
    this.nome = nome;
    this.salario = salario;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double increaseSalary(int percentage) {
    double calculate = this.getSalario() + (this.getSalario() * percentage / 100);
    this.setSalario(calculate);
    return calculate;
  }

  public String toString() {
    return this.getId() + ", " + this.getNome() + ", " + this.getSalario();
  }



}
