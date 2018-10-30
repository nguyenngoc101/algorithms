package interview.arrays;

import java.util.Scanner;

public class TweDimensionArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        int maxSum = Integer.MIN_VALUE;
        int temp;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                temp = sum(arr, i, j);
                if (maxSum < temp) maxSum = temp;
            }
        }
        System.out.println(maxSum);
    }


    public static int sum(int[][] a, int x, int y) {
        int sum = 0;
        for (int i = x; i <= x + 2; i++) {
            for (int j = y; j <= y + 2; j++) {
                if (i == x || i == x + 2 || ((i == x+1) && (j == y+1 ))) {
                    sum += a[i][j];
                }
            }
        }
        return sum;
    }
}
