package hackerrank.algorithms.DynamicProgramming;

import java.util.Scanner;

public class MyCoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        scanner.nextLine();
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(numberOfCoin(n, v, sum));
    }

    static int numberOfCoin(int n, int[] v, int sum) {
        int[] s = new int[sum+1];
        int[] trace = new int[sum + 1];

        for (int i = 0; i <= sum; i++) {
            s[i] = 9999;
        }
        s[0] = 0;
        for (int i = 0; i <= sum; i++) {
            for (int j = 0; j < n; j++) {
                if((i-v[j] >= 0) && (s[i] > s[i-v[j]] + 1 )) {
                    s[i] = s[i - v[j]] + 1;
                    trace[i] = v[j];
                }
            }

        }
        return s[sum];
    }
}
