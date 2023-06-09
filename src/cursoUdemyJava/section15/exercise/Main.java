package cursoUdemyJava.section15.exercise;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import javax.security.auth.login.AccountException;
import cursoUdemyJava.section15.exercise.entities.Account;

public class Main {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    try {
      System.out.println("Enter account data");
      System.out.print("Number: ");
      int accountNumber = sc.nextInt();

      System.out.print("Holder: ");
      String holder = sc.nextLine();
      sc.nextLine();

      System.out.print("Initial Balance: ");
      double initialBalance = sc.nextDouble();

      System.out.print("Withdraw limit: ");
      double withdrawLimit = sc.nextDouble();

      Account account = new Account(accountNumber, holder, initialBalance, withdrawLimit);
      System.out.println();
      System.out.print("Enter amount for withdraw: ");
      double amoutWithdraw = sc.nextDouble();
      account.withdraw(amoutWithdraw);

      System.out.print("New balance: " + account.getBalance());
    } catch (AccountException e) {
      System.out.println(e.getMessage());
    } catch (InputMismatchException e) {
      System.out.println(e.getMessage());
    }
    sc.close();
  }

}
