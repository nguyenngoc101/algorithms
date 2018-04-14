package hackerrank.Chanlenge30Days;

import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countConsecutiveOne(convertToBinary(n)));
    }

    public static String convertToBinary(int n) {
        String s = "";
        while (n > 0) {
            s = (n % 2) + s;
            n = n/2;
        }
        return s;
    }

    public static int countConsecutiveOne(String binary) {
        int countMax = 0;
        int count = 0;
        char[] binaries = binary.toCharArray();
        for (int i = 0; i < binaries.length; i++) {
            if (binaries[i] == '1') {
                count++;
                if (count > countMax) countMax = count;
            }
            else {
                count = 0;
            }
        }
        return countMax;
    }
}
