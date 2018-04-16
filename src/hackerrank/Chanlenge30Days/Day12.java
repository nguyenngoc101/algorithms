package hackerrank.Chanlenge30Days;

import java.util.Arrays;
import java.util.Scanner;

public class Day12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] persons =  scanner.nextLine().split(" ");
        int n = Integer.valueOf(scanner.nextLine());
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println(new Student(persons[0], persons[1], Integer.valueOf(persons[2]), scores).calculate());
    }

    public static class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        public Person(String firstName, String lastName, int identification){
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson(){
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + 	"\nID: " + idNumber);
        }

    }

    public static class Student extends Person {
        private int[] testScores;

        public Student(String firstName, String lastName, int identification, int[] testScores) {
            super(firstName, lastName, identification);
            this.testScores = testScores;
        }

        public char calculate() {
            double average = Arrays.stream(testScores).average().getAsDouble();
            if (90 <= average && average <=100) {
                return 'O';
            }
            else if (average >= 80 & average < 90) {
                return 'E';
            }
            else if (average >= 70 & average < 80) {
                return 'A';
            }

            else if (average >= 55 & average < 70) {
                return 'P';
            }

            else if (average >= 40 & average < 55) {
                return 'D';
            } else {
                return 'T';
            }

        }
    }
}
