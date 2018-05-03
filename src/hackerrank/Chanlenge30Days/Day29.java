package hackerrank.Chanlenge30Days;

import java.util.Scanner;

public class Day29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(maxBitwiseAnd(n, k));
        }
    }

    private static int maxBitwiseAnd(int n, int k) {
        int max = -99999;
        for (int i = 1; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                int andBit = i & j;
                if (andBit < k && andBit > max) {
                    max = andBit;
                }
            }
        }
        return max;
    }
}
