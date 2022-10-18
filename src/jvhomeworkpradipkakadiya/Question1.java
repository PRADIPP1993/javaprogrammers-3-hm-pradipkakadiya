package jvhomeworkpradipkakadiya;
/* 1.Write a java program that tells us that Input number is odd or even?
 HINT: use ternary operator (? :)*/
import java.util.Scanner;

public class Question1 {
    int num;
    String a;

    public static void main(String[] args) {
        System.out.println("Enter a number to odd or even:");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        String a = num % 2 == 0 ? "Even" : "Odd";
        System.out.println(a);
    }

    public void Form() {
        System.out.println(a);
    }
}
