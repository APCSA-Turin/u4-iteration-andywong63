public class DoNow {
    public static void main(String[] args) {
        String str1 = "apples and bananas";
        String str2 = "";
        for (int i = 0; i < str1.length(); i++) {
            if (!str1.substring(i, i + 1).equals(" ")) {
                str2 += str1.substring(i, i + 1);
            }
        }
        System.out.println(str2);

        String str3 = "apples and bananas";
        while (str3.indexOf(" ") != -1) {
            int index = str3.indexOf(" ");
            str3 = str3.substring(0, index) + str3.substring(index + 1);
        }
        System.out.println(str3);    
    }
}
