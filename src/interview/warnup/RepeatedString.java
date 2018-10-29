package interview.warnup;

import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        long n = scanner.nextLong();
        int length = s.length();
        int count = countCharAToIndex(s, length);
        long loop = n / length;
        long remain =  n % length;
        long result = loop * count + countCharAToIndex(s, remain) ;
        System.out.println(result);
    }

    private static int countCharAToIndex(String s, long length) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if(s.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }
}
