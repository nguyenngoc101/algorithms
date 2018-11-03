package interview.arrays;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        int swap = 0;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j>=1 && a[j] < a[j-1]) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                j--;
                swap++;
            }
        }
        System.out.println(swap);
    }
}
