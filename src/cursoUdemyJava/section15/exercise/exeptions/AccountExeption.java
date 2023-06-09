package cursoUdemyJava.section15.exercise.exeptions;

public class AccountExeption extends Exception {
  private static final long serialVersionUID = 1L;

  public AccountExeption(String message) {
    super(message);
  }

}
