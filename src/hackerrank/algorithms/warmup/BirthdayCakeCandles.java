package hackerrank.algorithms.warmup;

import java.util.Scanner;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        birthdayCakeCandles();
    }

    public static void birthdayCakeCandles() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = -999;
        int countMax = 0;
        int currentNumber;
        for (int i = 0; i < n; i++) {
            currentNumber = scanner.nextInt();
            if (currentNumber > max) {
                max = currentNumber;
                countMax = 1;
            }

            else if (currentNumber == max) {
                countMax++;
            }
        }
        System.out.println(countMax);
    }
}
