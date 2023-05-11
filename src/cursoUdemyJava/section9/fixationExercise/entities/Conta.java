package cursoUdemyJava.section9.fixationExercise.entities;

public class Conta {
  private String numeroDaConta;
  private String nomeTitular;
  private double saldo;

  public Conta(String numeroDaConta, String nomeTitular) {
    this.numeroDaConta = numeroDaConta;
    this.nomeTitular = nomeTitular;
    this.saldo = 0;
  }

  public Conta(String numeroDaConta, String nomeTitular, double saldo) {
    this.numeroDaConta = numeroDaConta;
    this.nomeTitular = nomeTitular;
    this.saldo = saldo;
  }

  public String getNomeTitular() {
    return nomeTitular;
  }

  public void setNomeTitular(String nomeTitular) {
    this.nomeTitular = nomeTitular;
  }

  public double getSaldo() {
    return saldo;
  }

  public String getNumeroDaConta() {
    return numeroDaConta;
  }

  public void deposito(double valor) {
    this.saldo += valor;
  }

  public void saque(double valor) {
    this.saldo -= (valor + 5.00);
  }

}
