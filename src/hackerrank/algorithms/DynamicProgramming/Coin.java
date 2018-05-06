package hackerrank.algorithms.DynamicProgramming;

import java.util.Arrays;

public class Coin {
    public static void main(String[] args) {
        int[] coins = {1, 3, 5};
        System.out.println(minimizeCoins(3, coins, 11));
    }

    public static int minimizeCoins(int n, int[] v, int s) {
        int[] p = new int[s + 1];
        int[] trace = new int[s + 1];
        for (int i = 1; i <= s; i++) {
            int min = 99999;
            for (int j = 0; j < n; j++) {
                if (i >= v[j] && (p[i-v[j]] + 1 < min)) {
                    min = p[i-v[j]] + 1;
                    trace[i] = v[j];
                }
            }
            p[i] = min;
        }

        int coin = trace[s];
        int remain = s;
        System.out.println("Coins: ");
        while (remain > 0) {
            System.out.print(coin + " ");
            remain = remain - coin;
            coin = trace[remain];
        }
        System.out.println();

        return p[s];
    }
}
