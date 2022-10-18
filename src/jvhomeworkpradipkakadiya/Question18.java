package jvhomeworkpradipkakadiya;
/*write a Java program to sum values of an array*/
import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        sum();
    }

    public static void sum() {

        int[] arr = new int[]{1, 2, 3, 4, 5};
       Scanner abc1 = new Scanner(System.in);
       System.out.print("Types Number after arr all number total sum:  ");
        int sum = abc1.nextInt();
        for (int i = sum; i < arr.length ; i++) {
            sum = sum + arr[i];
        }
            System.out.println("This value Sum is  : " + sum);

    }
}
