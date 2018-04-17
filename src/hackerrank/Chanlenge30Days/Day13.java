package hackerrank.Chanlenge30Days;

import java.util.Scanner;

public class Day13 {
    static abstract class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        abstract void display();
    }

    static class MyBook extends Book {

        private int price;

        MyBook(String title, String author, int price) {
            super(title, author);
            this.price = price;
        }

        @Override
        public void display() {
            System.out.println("Title: "+this.title);
            System.out.println("Author: "+this.author);
            System.out.println("Price: "+this.price);
        }
    }

    static class Solution {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String title = scanner.nextLine();
            String author = scanner.nextLine();
            int price = scanner.nextInt();
            scanner.close();

            Book book = new MyBook(title, author, price);
            book.display();
        }
    }
}
