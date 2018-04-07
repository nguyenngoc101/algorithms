package conversions;

import java.util.Scanner;
import java.util.stream.IntStream;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a binary number: ");
        String binaryStr = scanner.next();
        System.out.println(binaryToDecimal(binaryStr));
    }

    public static Integer binaryToDecimal(String binaries) {
        int length = binaries.length();
        return IntStream.range(0, length)
                .map(i -> Character.getNumericValue(binaries.charAt(length -1 - i)) * (int) Math.pow(2, i)).sum();
    }
}
