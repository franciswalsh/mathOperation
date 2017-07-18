package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double operand1 = 0;
        double operand2 = 0;
        boolean firstOperand = true;
        boolean secondOperand = true;

        while(firstOperand){
            try {
                System.out.println("What is your first number?");
                operand1 = Double.parseDouble(scanner.nextLine());
                firstOperand = false;
            }
            catch (NumberFormatException ex){
                System.out.println("Your input was not a number. Please try again.");
                firstOperand = true;
            }
        }

        while(secondOperand){
            try {
                System.out.println("What is your second number?");
                operand2 = Double.parseDouble(scanner.nextLine());
                secondOperand = false;
            }
            catch (NumberFormatException ex){
                System.out.println("Your input was not a number. Please try again.");
                secondOperand = true;
            }
        }

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
