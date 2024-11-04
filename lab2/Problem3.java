import java.util.Scanner;

public class Problem3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("What number do you want to halve to one? ");
    int userNumber = scanner.nextInt();    
    scanner.close();
    int halved = userNumber;
    int iterations = 0;
    while (halved > 1) {
      iterations++;
      halved /= 2;
      System.out.println(halved);
    }
    System.out.println("It takes " + iterations + " halvings to get from " + userNumber + " to 1.");
  }
}