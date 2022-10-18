package jvhomeworkpradipkakadiya;
/*. Write a Java program to sort a numeric array and a string array.*/
import java.util.Arrays;

public class Question17 {
    public static void main(String[] args){
        int[] numbers = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        Arrays.sort(numbers);
        System.out.println("Numbers in Ascending Order: ");
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }

        System.out.println();
        String[] cities = {"surat", "vadodara", "rajkot","bhavnagar","anand","bhuj","vapi","valsad","kalol","girsomnath"};
        Arrays.sort(cities);
        System.out.println(" Cities in Alphabetical Order: ");
        for (int i = 0; i < cities.length; i++)
        {
            System.out.println(cities[i]);
        }
    }
}