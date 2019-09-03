package leetcode;

public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome(""));
    }

    public static String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        int length = s.length();
        int[] longest = new int[length];
        String[] pals = new String[length];
        longest[0] = 1;
        pals[0] = s.substring(length - 1);

        for (int i = 1; i < length; i++) {
            String palindromeAtLast = palindromeAtLast(s.substring(0, i + 1));
            if (longest[i-1] >= palindromeAtLast.length()) {
                longest[i] = longest[i-1];
                pals[i] = pals[i - 1];
            } else {
                longest[i] = palindromeAtLast.length();
                pals[i] = palindromeAtLast;
            }

        }
        return pals[length-1];
    }

    private static String palindromeAtLast(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            String substring = s.substring(i, length);
            if (isPalindrome(substring)) {
                return substring;
            }
        }
        return s.substring(length-1);
    }


    public static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i <=j && chars[i] == chars[j]) {
            i++;
            j--;
        }
        return i > j;
    }
}
