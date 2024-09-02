package lesson0;

import java.util.Scanner;

public class Ex1 {
  public void demo() {
    // Ask the user for two integers
    // By using separate variables print the sum, product and quotient of the
    // numbers to the console.

    Integer a;
    Integer b;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("1st Integer?");
    a = keyboard.nextInt();
    System.out.println("a=" + a);
    keyboard.close();

  }
}
