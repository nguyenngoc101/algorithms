package hackerrank.algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class SimpleArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = Integer.valueOf(scanner.nextLine());
        String elements = scanner.nextLine();
        String[] arr = elements.split(" ");
        int[] intArr = Stream.of(arr).mapToInt(Integer::parseInt).toArray();
        System.out.println(sum(intArr));
    }

    public static int sum(int[] arr) {
        return Arrays.stream(arr).sum();
    }
}
