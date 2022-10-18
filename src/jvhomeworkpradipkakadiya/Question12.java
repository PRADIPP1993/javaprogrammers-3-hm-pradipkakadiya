package jvhomeworkpradipkakadiya;
/*Write a program that tells us input value is number or an alphabet or symbol*/
import java.util.Scanner;

public class Question12 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a character: ");
        char i = in.nextLine().charAt(0);

        if ((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z')) {
            System.out.println("Alphabet");

        } else if (i >= '0' && i <= '9') {
            System.out.println("Number");

        } else {
            System.out.println("Symbol");
        }
    }
}



