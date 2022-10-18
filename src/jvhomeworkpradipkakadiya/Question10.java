package jvhomeworkpradipkakadiya;
/*Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)
*/
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Any two numbers");
        double num1 = input.nextInt();
        double num2 = input.nextInt();
        System.out.println("Enter symbol");
        char symbol = input.next().charAt(0);

        if (symbol == '+') {
            System.out.println(num1 + num2);
        } else if (symbol == '-') {
            System.out.println(num1 - num2);
        } else if (symbol == '*') {
            System.out.println(num1 * num2);
        } else if (symbol == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Invalid symbol");
        }
    }
}

