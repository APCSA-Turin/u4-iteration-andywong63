import java.util.Scanner;

public class Problem4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What number do you want to factorial? ");
    System.out.print("Enter a number between 0 and 170: ");
    int userNumber = scanner.nextInt();
    while (userNumber < 0 || userNumber > 170) {
      System.out.print("No! Between 0 and 170: ");
      userNumber = scanner.nextInt();
    }
    scanner.close();
    double result = 1;
    int counter = 1;
    while (counter <= userNumber) {
      result *= counter;
      counter++;
    }
    System.out.println(userNumber + "! is " + result);
  }
}