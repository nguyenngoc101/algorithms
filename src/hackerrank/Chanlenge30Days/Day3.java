package hackerrank.Chanlenge30Days;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        /*If  is odd, print Weird
        If  is even and in the inclusive range of  to , print Not Weird
        If  is even and in the inclusive range of  to , print Weird
        If  is even and greater than , print Not Weird*/
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n % 2 != 0 || (n % 2 == 0 && n>=6 && n<=20))
            System.out.println("Weird");
        else
            System.out.println("Not Weird");
    }
}
