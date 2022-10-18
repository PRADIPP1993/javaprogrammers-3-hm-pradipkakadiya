package jvhomeworkpradipkakadiya;
/*2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?
*/
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        //int year = 2020;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Year:    ");
        int year = scanner.nextInt();
        boolean leap;
        leap = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}

