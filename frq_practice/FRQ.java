public class FRQ {
    public void printNums(int value, int numRounds) {
        for (int i = 0; i < numRounds; i++) {
            String result = "";
            int lastNum = -1;
            while (lastNum != value) {
                lastNum = (int) (Math.random() * 10);
                result += lastNum;
            }
            System.out.println(result);
        }
    }

    public String longestStreak(String str) {
        String longestChar = "";
        int longestLen = 0;
        String prevChar = "";
        int currentLen = 0;
        for (int i = 0; i < str.length(); i++) {
            String currentChar = str.substring(i, i + 1);
            if (currentChar.equals(prevChar)) {
                currentLen++;
            } else {
                if (currentLen > longestLen) {
                    longestLen = currentLen;
                    longestChar = prevChar;
                }
                currentLen = 1;
                prevChar = currentChar;
            }
            if (currentLen > longestLen) {
                longestLen = currentLen;
                longestChar = prevChar;
            }
        }
        return longestChar + " " + longestLen;
    }
}