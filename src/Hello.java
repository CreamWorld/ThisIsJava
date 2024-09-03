import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        boolean result1 = isPalindrome("A man a plan a canal Panama");
        System.out.println(result1); // 출력: true

        boolean result2 = isPalindrome("Hello, World!");
        System.out.println(result2); // 출력: false
    }

    public static boolean isPalindrome( String str ) {
        str = str.replace("[^a-zA-Z]", "").toLowerCase();
        int startIdx = 0;
        int lastIdx = str.length() - 1;
        while(startIdx <= lastIdx) {
            if(str.charAt(startIdx) != str.charAt(lastIdx)){
                return false;
            }
            startIdx++;
            lastIdx--;
        }
        return true;
    }
}
