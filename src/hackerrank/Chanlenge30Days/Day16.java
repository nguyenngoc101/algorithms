package hackerrank.Chanlenge30Days;

import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        try {
            System.out.println(Integer.valueOf(number));
        } catch (NumberFormatException ex) {
            System.out.println("Bad String");
        }
    }
}
