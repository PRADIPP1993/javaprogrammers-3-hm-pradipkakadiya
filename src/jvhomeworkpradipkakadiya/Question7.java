package jvhomeworkpradipkakadiya;
/*Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
*/
import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sales ID: ");
        int id = input.nextInt();
        System.out.print("Enter seller's name: ");
        String name = input.next();
        System.out.print("Enter sales amount: ");
        double salesAmount = input.nextDouble();
        System.out.print("Enter salary basic: ");
        double salaryBasic = input.nextDouble();
        double commission = 0;
        if (salesAmount >= 50000) {
            commission = salesAmount * 35/100;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 20/100;
        } else if (salesAmount >= 20000) {
            commission = salesAmount * 10/100;
        } else if (salesAmount >= 10000) {
            commission = salesAmount * 5/100;
        }
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Sales amount: " + salesAmount);
        System.out.println("Salary basic: " + salaryBasic);
        System.out.println("Commission: " + commission);
    }
}
