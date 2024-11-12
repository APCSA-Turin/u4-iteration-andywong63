public class CodingBat {
    public static int maxBlock(String str) {
        int highestCount = 0;
        int count = 0;
        String lastLetter = "";
        for (int i = 0; i < str.length(); i++) {
            String currentLetter = str.substring(i, i + 1);
            if (lastLetter.equals(currentLetter)) {
                count++;
                if (count > highestCount) {
                    highestCount = count;
                }                
            } else {
                if (count > highestCount) {
                    highestCount = count;
                }
                count = 1;
                lastLetter = currentLetter;
            }
        }
        return highestCount;
    }

    public static void main(String[] args) {
        System.out.println(maxBlock("xyzz"));
    }
}