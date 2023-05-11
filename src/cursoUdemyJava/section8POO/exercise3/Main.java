package cursoUdemyJava.section8POO.exercise3;

import java.util.Scanner;

/**
 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres
 * do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual
 * a nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em
 * caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da
 * nota). Você deve criar uma classe Student para resolver este problema.
 */
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Student student = new Student();

    String nome = sc.next();
    double primeiraMedia = sc.nextDouble();
    double segundaMedia = sc.nextDouble();
    double terceiraMedia = sc.nextDouble();
    student.setName(nome);
    student.setPrimeiroTri(primeiraMedia);
    student.setSegundoTri(segundaMedia);
    student.setTerceiroTri(terceiraMedia);
    System.out.println(student);

    sc.close();

  }

}
