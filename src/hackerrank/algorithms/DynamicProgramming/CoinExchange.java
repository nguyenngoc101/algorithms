package hackerrank.algorithms.DynamicProgramming;

import java.util.Arrays;

public class CoinExchange {

    public static int countWays1(int[] coins, int n, int s) {
        // coins = [1,3,5]
        // n = 3
        // s = 11
        int[] result = new int[s + 1];
        result[0] = 1;
        for (int i = 1; i <= s; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= coins[j]) {
                    result[i] = result[i] + result[i - coins[j]];
                }
            }

        }

        return result[s];

    }

//    static long countWays(int S[], int m, int n)
//    {
//        //Time complexity of this function: O(mn)
//        //Space Complexity of this function: O(n)
//
//        // table[i] will be storing the number of solutions
//        // for value i. We need n+1 rows as the table is
//        // constructed in bottom up manner using the base
//        // case (n = 0)
//        long[] table = new long[n+1];
//
//        // Initialize all table values as 0
//        Arrays.fill(table, 0);   //O(n)
//
//        // Base case (If given value is 0)
//        table[0] = 1;
//
//        // Pick all coins one by one and update the table[]
//        // values after the index greater than or equal to
//        // the value of the picked coin
//        for (int i=0; i<m; i++)
//            for (int j=S[i]; j<=n; j++)
//                table[j] += table[j-S[i]];
//
//        return table[n];
//    }

    static long countWays( int S[], int m, int n )
    {
        int i, j;
        long x, y;

        // We need n+1 rows as the table
        // is constructed in bottom up
        // manner using the base case 0
        // value case (n = 0)
        long[][] table  = new long[n + 1][m];

        // Fill the enteries for 0
        // value case (n = 0)
        for (i = 0; i < m; i++)
            table[0][i] = 1;

        // Fill rest of the table entries
        // in bottom up manner
        for (i = 1; i < n + 1; i++)
            for (j = 0; j < m; j++)
            {
                {
                    // Count of solutions including S[j]
                    x = (i-S[j] >= 0) ? table[i - S[j]][j] : 0;

                    // Count of solutions excluding S[j]
                    y = (j >= 1) ? table[i][j - 1] : 0;

                    // total count
                    table[i][j] = x + y;
                }
            }
        return table[n][m - 1];
    }

    // Driver Function to test above function
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3};
        int m = arr.length;
        int n = 4;
        System.out.println(countWays1(arr, m, n));
    }
}
