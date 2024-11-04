import java.util.Scanner;

public class Problem1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer greater than 5: ");
    int userNumber = scanner.nextInt();
    while (userNumber <= 5) {
      System.out.print("Try again: ");
      userNumber = scanner.nextInt();
    }
    scanner.close();
    int counter = 0;
    while (counter < userNumber) {
      System.out.println(counter);
      counter++;
    }
    System.out.println("and finally " + counter);
  }
}