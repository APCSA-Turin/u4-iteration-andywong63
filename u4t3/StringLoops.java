package u4t3;

public class StringLoops {
  // default constructor; no instance variables
  public StringLoops() {
  }

  /*
   * Returns the number of times "character" appears in "searchString"
   * This should be NON-case sensitive!
   * 
   * Examples:
   * - if character = "a" and searchString = "Apple and banana",
   * this method returns 5 (it finds BOTH "A" and "a")
   * - if character = "A" and searchString = "Apple and banana",
   * this method returns 5 (it finds BOTH "A" and "a")
   * - if character = "!" and searchString = "Hello! Nice day!",
   * this method returns 2
   * 
   * DO THIS WITH A FOR LOOP
   */
  public int countCharacters(String character, String searchString) {
    int count = 0;
    for (int i = 0; i < searchString.length(); i++) {
      if (searchString.substring(i, i + 1).toLowerCase().equals(character.toLowerCase())) {
        count++;
      }
    }
    return count;
  }

  /*
   * Returns the original string reversed
   * 
   * Examples:
   * - if origString = "hello!" this method returns "!olleh"
   * - if origString = "Apples and bananas" this method returns
   * "sananab dna selppA"
   */
  public String reverseString(String origString) {
    String reversed = "";
    for (int i = origString.length() - 1; i >= 0; i--) {
      reversed += origString.substring(i, i + 1);
    }
    return reversed;
  }

  public String removeA(String str) {
    String result = "";
    for (int i = 0; i < str.length(); i++) {
      String character = str.substring(i, i + 1);
      if (!character.equals("a")) {
        result += character;
      }
    }
    return result;
  }

  /*
   * Returns a String with all instances of "searchChar" in "origString" replaced
   * with "replaceChar"; matches should be case sensitive (i.e. no need to worry
   * about lowercase vs. uppercase)
   * 
   * PRECONDITION: searchChar and replaceChar are single characters and are not
   * equal
   */
  public String replaceCharacterV1(String searchChar, String origStr, String replaceChar) {
    String result = "";
    for (int i = 0; i < origStr.length(); i++) {
      String character = origStr.substring(i, i + 1);
      if (character.equals(searchChar)) {
        result += replaceChar;
      } else {
        result += character;
      }
    }
    return result;
  }

  /*
   * DOES THE EXACT SAME THING AS replaceCharacterV1, except using a while loop
   * 
   * PRECONDITION: searchChar and replaceChar are single characters and are not
   * equal
   */
  public String replaceCharacterV2(String searchChar, String origStr, String replaceChar) {
    String result = "";
    int index = 0;
    while (index < origStr.length()) {
      String character = origStr.substring(index, index + 1);
      if (character.equals(searchChar)) {
        result += replaceChar;
      } else {
        result += character;
      }
      index++;
    }
    return result;
  }

  /*
   * Returns the number of times "searchString" appears in "origString";
   * matches should be case sensitive (i.e. no need to worry about lower vs.
   * uppercase)
   */
  public int countString(String searchString, String origString) {
    int occurrences = 0;
    for (int i = 0; i < origString.length() - searchString.length() + 1; i++) {
      String character = origString.substring(i, i + searchString.length());
      if (character.equals(searchString)) {
        occurrences++;
      }
    }
    return occurrences;
  }

  /*
   * Returns a String with all instances of "searchString" removed from
   * "origString"; matches should be case sensitive (i.e. no need to worry about
   * lowercase vs. uppercase)
   */
  public String removeString(String searchString, String origString) {
    int searchLen = searchString.length();
    while (origString.indexOf(searchString) != -1) {
      int index = origString.indexOf(searchString);
      String before = origString.substring(0, index);
      String after = origString.substring(index + searchLen);
      origString = before + after;
    }
    return origString;
  }

  /*
   * Prints all integers from fromNum through toNum, separated by a commas and a
   * space, on a single line; there should NOT be a comma after the final number.
   * If fromNum == toNum, print just the number and no comma.
   * If fromNum > toNum, the numbers should be printed in descending order.
   * After all numbers are printed, move the cursor to the next line.
   */
  public void commaSeparated(int fromNum, int toNum) {
    if (fromNum < toNum) {
      for (int i = fromNum; i < toNum; i++) {
        System.out.print(i + ", ");
      }
    } else {
      for (int i = fromNum; i > toNum; i--) {
        System.out.print(i + ", ");
      }
    }
    System.out.println(toNum);
  }

  /*
   * Returns true if myString is a palindrome, i.e. the characters read the same
   * forwards and backwards, and false otherwise. Don't worry about case.
   * NOTE! Spaces should be disregarded when determining if it's a palindrome.
   * "no lemon no melon" is a palindrome!
   */
  public boolean isPalindrome(String myString) {
    myString = removeString(" ", myString);
    return myString.equals(reverseString(myString));
  }

  /*
   * Prints the String toPrint num times on a single line separated by spaces,
   * within an opening bracket and closing bracket; there should not be a space
   * between the final toPrint and the closing bracket,
   * e.g. [hello hello hello hello]
   * 
   * If numtimes <= 0, print just empty brackets (no space): []
   * After printing the closing bracket, move the cursor to the next line.
   */
  public void multiPrint(String toPrint, int num) {
    System.out.print("[");
    for (int i = 1; i < num; i++) {
      System.out.print(toPrint + " ");
    }
    if (num > 0) {
      System.out.println(toPrint + "]");
    } else {
      System.out.println("]");
    }
  }
}