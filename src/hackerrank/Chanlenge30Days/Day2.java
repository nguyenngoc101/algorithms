package hackerrank.Chanlenge30Days;

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double price = scanner.nextDouble();
        Double tip = scanner.nextDouble();
        Double tax = scanner.nextDouble();
        System.out.println("The total meal cost is " +costMeal(price, tip, tax) +  " dollars.");
    }

    public static int costMeal(Double price, Double tip, Double tax) {
        return (int) Math.round(price + price * (tip + tax)/100);
    }
}