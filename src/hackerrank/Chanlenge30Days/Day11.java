package hackerrank.Chanlenge30Days;

import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int max = -9999;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <=3 ; j++) {
                int sum = sumMatrix(matrix, i, j);
                if (sum > max) max = sum;
            }
        }
        System.out.println(max);

    }

    public static int sumMatrix(int[][] arr, int i, int j) {
        int sum = 0;
        for (int k = i; k < i + 3; k++) {
            for (int l = j; l < j + 3; l++) {
                if (k == i || k == i+2 || ((k == i + 1) && (l == j + 1))) {
                    sum += arr[k][l];
                }
            }
        }
        return sum;
    }
}
