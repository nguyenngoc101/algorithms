package hackerrank.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[] elements = convertStringToIntArr(scanner.nextLine().split(" "));
        scanner.close();

        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < size; i++) {
            if (elements[i] > 0) posCount++;
            else if (elements[i] == 0) zeroCount++;
            else negCount++;
        }

        System.out.println((float) posCount/size);
        System.out.println((float) negCount/size);
        System.out.println((float) zeroCount/size);
    }

    public static int[] convertStringToIntArr(String[] strs) {
        return Arrays.stream(strs).mapToInt(e -> Integer.parseInt(e)).toArray();
    }
}
