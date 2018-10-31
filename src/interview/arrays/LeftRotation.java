package interview.arrays;

import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int rotations = d % n;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[(i - rotations + n) % n] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
