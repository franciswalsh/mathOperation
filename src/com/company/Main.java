package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your first number?");
        double operand1 = Double.parseDouble(scanner.nextLine());
        System.out.println("What is your second number?");
        double operand2 = Double.parseDouble(scanner.nextLine());

        double sum = operand1 + operand2;
        double difference = operand1 - operand2;
        double multiplication = operand1 * operand2;
        double division = operand1 / operand2;
        double remainder = operand1 % operand2;

        showResults(sum, difference, multiplication, division, remainder);
    }


        public static void showResults(double sumInput,
                                       double differenceInput,
                                       double multiplicationInput,
                                       double divisionInput,
                                       double remainderInput){
            System.out.println("The sum result is: " + sumInput);
            System.out.println("The difference result is: " + differenceInput);
            System.out.println("The multiplication result is: " + multiplicationInput);
            System.out.println("The division result is: " + divisionInput);
            System.out.println("The remainder result is: " + remainderInput);
        }
}
