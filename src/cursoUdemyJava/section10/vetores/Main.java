package cursoUdemyJava.section10.vetores;

import java.util.Scanner;
import cursoUdemyJava.section10.vetores.entities.Estudante;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("How many rooms will be rented? ");
    int n = sc.nextInt();
    Estudante[] rooms = new Estudante[10];

    for (int index = 0; index < n; index++) {
      System.out.println("Rent #" + (index + 1));
      sc.nextLine();
      System.out.print("Name: ");
      String name = sc.nextLine();
      System.out.print("Email: ");
      String email = sc.nextLine();
      System.out.print("Room: ");
      int room = sc.nextInt();

      rooms[room] = new Estudante(name, email, room);

    }

    for (int index = 0; index < rooms.length; index++) {

      if (rooms[index] != null) {
        System.out.println("Busy rooms:");
        System.out.println(rooms[index].getQuarto() + ": " + rooms[index]);
      }
    }


    sc.close();
  }

}
