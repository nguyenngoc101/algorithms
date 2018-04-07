package conversions;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter an integer: ");
            Integer decimal = Integer.valueOf(scanner.next());
            System.out.println(decimalToBinary(decimal));
            System.out.println(Integer.toBinaryString(decimal));
        }
    }

    public static String decimalToBinary(Integer decimal) {
        int k;
        String b = "";
        while(decimal > 0) {
            k = decimal % 2;
            decimal = decimal / 2;
            b = String.valueOf(k) + b;
        }
        return b;
    }
}
