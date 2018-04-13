package hackerrank.algorithms.implementations;

import java.util.Scanner;

public class BreakingRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = -999;
        int min = Integer.MAX_VALUE;
        int countMax = -1;
        int countMin = -1;
        int current;

        for (int i = 0; i < n; i++) {
            current = scanner.nextInt();
            if(current > max) {
                max = current;
                countMax++;
            }
            if (current < min) {
                min = current;
                countMin++;
            }
        }
        System.out.println(countMax + " "+countMin);

    }


}
