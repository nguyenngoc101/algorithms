package hackerrank.algorithms.implementations;

import java.util.Arrays;
import java.util.Scanner;

public class BigSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        Arrays.sort(arr, (a, b) -> {
            int k = a.length();
            int m = b.length();
            if (k==m) return a.compareTo(b);
            return  k > m ? 1 : -1;
        });

        StringBuilder builder = new StringBuilder("");
        for(String num : arr)
            builder.append(num+"\n");
        System.out.println(builder);
    }

    // bubble sort
    public static String[] bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if (true) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    // selection sort
    public static String[] selectionSort(String[] arr) {
        int n = arr.length;
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (isGreaterThan(arr[i], arr[j])) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static boolean isGreaterThan(String a, String b) {
        int n = a.length();
        int m = b.length();
        if (n == m) return a.compareTo(b) > 0;
        return n > m;
    }
}
