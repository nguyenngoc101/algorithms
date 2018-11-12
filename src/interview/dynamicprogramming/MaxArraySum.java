package interview.dynamicprogramming;

import java.util.Scanner;

public class MaxArraySum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }
    scanner.close();
    System.out.println(maxSubsetSum(arr));
  }

  public static int maxSubsetSum(int[] arr) {
    if (arr.length == 0) return 0;
    arr[0] = Math.max(0, arr[0]);
    if (arr.length == 1) return arr[0];
    arr[1] = Math.max(arr[0], arr[1]);
    for (int i = 2; i < arr.length; i++)
      arr[i] = Math.max(arr[i-1], arr[i]+arr[i-2]);
    return arr[arr.length-1];
  }
}
