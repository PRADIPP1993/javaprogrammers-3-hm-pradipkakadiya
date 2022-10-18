package jvhomeworkpradipkakadiya;
/* Same as above program-8 using switch statement.*/
import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter one alphabet from A to F: ");
        char input = scan.next().charAt(0);
        switch (input) {
            case 'A':
                System.out.println("City name is: Agra");
                break;
            case 'B':
                System.out.println("City name is: Baroda");
                break;
            case 'C':
                System.out.println("City name is: Chennai");
                break;
            case 'D':
                System.out.println("City name is: Delhi");
                break;
            case 'E':
                System.out.println("City name is: Ernakulam");
                break;
            case 'F':
                System.out.println("City name is: Faridabad");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        scan.close();
    }
}
