package jvhomeworkpradipkakadiya;
/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
*/
import java.util.Scanner;

public class Question8 {

    public static void main(String args[])
    {
        char city;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        city= scanner.next().charAt(0);
        if(city=='A' || city=='a')
        {
            System.out.print("Character is A \n");
            System.out.print("Agra");
        }

        else if(city=='B' || city=='b')
        {
            System.out.print("Character is B \n");
            System.out.print("Baroda");
        }

        else if(city=='C' || city=='c')
        {
            System.out.print("Character is C \n");
            System.out.print("Chennai");
        }

        else if(city=='D' || city=='d')
        {
            System.out.print("Character is D \n");
            System.out.print("Delhi");
        }

        else if(city=='E' || city=='e')
        {
            System.out.print("Character is E \n");
            System.out.print("Ernakulam");
        }

        else if(city=='F' || city=='f')
        {
            System.out.print("Character is F \n");
            System.out.print("Faridabad");
        }
        else
        {
            System.out.print("Invalid Entry");
        }
    }
}

