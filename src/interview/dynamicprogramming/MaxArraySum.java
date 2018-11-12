package interview.dynamicprogramming;

import java.util.Arrays;
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
    System.out.println(maxSubsetSum2(arr));
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

  public static int maxSubsetSum2(int[] arr) {
    int n = arr.length;
    int s[] = new int[n];
    s[0] = arr[0];
    s[1] = arr[1];
    for (int i = 0; i < n; i++) {
      int max = -999;
      for (int j = 0; j < i - 1; j++) {
        if (max < s[j] + arr[i]) max = s[j] + arr[i];
      }
      if (i < n - 1 && max < arr[i]) max = arr[i];
      s[i] = max;
    }
    return Arrays.stream(s).max().getAsInt();
  }
}
