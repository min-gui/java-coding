package codingtest.algorithm.algorithmbookwithjavakotlin.ch6;

public class ValidPalindrome {

    public static void main() {
        isPalindrome("A man, a plan, a canal: Panama");
    }

    public static boolean isPalindrome(String s) {

        String replaceStr = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        if(replaceStr.length() == 0 || replaceStr.length() == 1) return true;

        String reverseStr = new StringBuilder(replaceStr).reverse().toString();

        if (replaceStr.equals(reverseStr)){
            return true;
        }

        return false;

    }
}
