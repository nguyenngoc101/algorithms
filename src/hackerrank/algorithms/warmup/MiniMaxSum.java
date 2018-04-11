package hackerrank.algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] a = new long[5];
        long sum = 0;

        for (int i = 0 ; i < a.length ; i++){
            long temp = in.nextLong();
            a[i] = temp;
            sum += temp;
        }

        Arrays.sort(a);
        System.out.println((sum - a[a.length-1]) + " " + (sum - a[0]));
    }
}
