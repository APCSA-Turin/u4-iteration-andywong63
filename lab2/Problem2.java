public class Problem2 {
  public static void main(String[] args) {
    int rollNum = 0;
    int dice1 = 0;
    int dice2 = 0;
    while (dice1 != 1 || dice2 != 1) {
      rollNum++;
      dice1 = rollDice();
      dice2 = rollDice();
      System.out.println("Roll #" + rollNum + ": " + dice1 + " and " + dice2);
      if (dice1 == 1 && dice2 == 1) {
        System.out.println("Finally, snake eyes!");
      } else {
        System.out.println("Not snake eyes, rolling again!");
      }
    }
  }

  private static int rollDice() {
    return (int) (Math.random() * 6) + 1;
  }
}