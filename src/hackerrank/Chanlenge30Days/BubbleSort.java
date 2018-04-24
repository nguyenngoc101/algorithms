package hackerrank.Chanlenge30Days;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.println("Array is sorted in " + sort(a) + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " +a[a.length-1]);
    }

    public static int sort(int[] a){
        int numberOfSwaps = 0;
        for(int i= 0; i< a.length; i++){
            for (int j= 0; j< a.length-i-1; j++){
                if(a[j] > a[j+1]){
                    int tem = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tem;
                    numberOfSwaps++;
                }
            }

            if (numberOfSwaps == 0) {
                break;
            }
        }
        return numberOfSwaps;
    }
}