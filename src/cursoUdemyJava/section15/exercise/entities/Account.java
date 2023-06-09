package cursoUdemyJava.section15.exercise.entities;

import javax.security.auth.login.AccountException;

public class Account {
  private int number;
  private String holder;
  private double balance;
  private double withDrawLimit;

  public Account() {}

  public Account(int number, String holder, double balance, double withDrawLimit) {
    this.number = number;
    this.holder = holder;
    this.balance = balance;
    this.withDrawLimit = withDrawLimit;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public double getBalance() {
    return balance;
  }

  public double getWithDrawLimit() {
    return withDrawLimit;
  }

  public void deposit(double amount) {
    this.balance += amount;
  }

  public void withdraw(double amount) throws AccountException {
    this.balance -= amount;
    if (amount > this.withDrawLimit) {
      throw new AccountException("Withdraw error: The amount exceeds withdraw limit");
    }
    if (this.balance < 0) {
      throw new AccountException("Withdraw error: Not enough balance");
    }
  }
}
