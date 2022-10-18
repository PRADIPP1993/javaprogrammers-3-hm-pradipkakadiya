package jvhomeworkpradipkakadiya;
/*Write a java program to input any number and find out if it’s odd or even*/
import java.util.Scanner;

public class Question6 {


    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any number: ");
        num = input.nextInt();
        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
