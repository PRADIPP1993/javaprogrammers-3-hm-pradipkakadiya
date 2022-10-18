package jvhomeworkpradipkakadiya;
/*Number of Days In Month
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
otherwise return false.
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
Example of input/Output:
● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
● isLeapYear(1600); should return true since 1600 is a leap year
● isLeapYear(2017); should return false since 2017 is not a leap year
● isLeapYear(2000);should return true because 2000 is a leap year
Write another method getDaysInMonth with two parameter month and year. Both of type
int.
If parameter month is < 1 or >12 return -1.
If parameter year is <1 or >9999 than return -1.
This method needs to return the number of days in the month. Be careful about leap years
they have 29 days in month 2 (February).
You should check if the year is a leap year using the method isLeapYear describe above.
Example of input/Output:
● getDaysInMonth(1, 2020); should return 31 since January has 31 days.
● getDaysInMonth(2, 2020); should return 29 since February has 29 days in a year and 2020 is a leap
 year.
● getDaysInMonth(2, 2018); should return 28 since February has 28 days if it’s not a leap year and
 2018 is not a leap year.
● getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
● getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1 to
 9999
HINT: Use the switch statement.
NOTE: Methods isLeapYear and getDaysInMonth need to be public static*/
public class Question4 {

    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);

        getDaysInMonth(1,2020);
        getDaysInMonth(2,2020);
        getDaysInMonth(2,2018);
        getDaysInMonth(-1,2020);
        getDaysInMonth(1,-2020);
    }
    public static boolean isLeapYear(int year) {
        boolean ans = false;
        if (year >= 1 && year <= 9999) {
            if((year % 4==0) && (year %100 !=0)||(year % 400==0)){
                System.out.println("should restur true since " + year + "is a leap year");
                ans = true;
            } else {
                System.out.println("should return false since" + year + "is not a leap year");
                ans = false;
            }
        }else

        {
            System.out.println("should return false since the parameter is not in the range(1-9999)");
        }
        return ans;
    }
    public static int getDaysInMonth(int month,int year){
        if (month <1 || month>12){
            System.out.println("the parameter month is invalid");
            return  -1;
        } else if (year <1 || year >9999) {
            System.out.println("the parameter year is outside the range of 1 to 9999");
            return  -1;
        }else {
            int a=0;
            switch (month){
                case 1:
                    System.out.println("January has 31 days in a "+ year);
                    a=1;
                    break;
                case 2:
                    System.out.println("february has 29 days in a "+year);
                    a=2;
                    break;
                case 3:
                    System.out.println("March has a 31 days in a "+year);
                    a=3;
                    break;
                case 4:
                    System.out.println("April has a 30 days in a"+year);
                    a=4;
                    break;
                case 5:
                    System.out.println("May  has a 31 days in a"+year);
                    a=5;
                    break;

                case 6:
                    System.out.println("June  has a 30 days in a"+year);
                    a=6;
                    break;
                case 7:
                    System.out.println("July  has a 31days in a"+year);
                    a=7;
                    break;

                case 8:
                    System.out.println("August  has a 31 days in a"+year);
                    a=8;
                    break;

                case 9:
                    System.out.println("September has a 30 days in a"+year);
                    a=9;
                    break;

                case 10:
                    System.out.println("Oct0ber  has a 31 days in a"+year);
                    a=10;
                    break;

                case 11:
                    System.out.println("November has a 30days in a"+year);
                    a=11;
                    break;
                case 12:
                    System.out.println("December  has a 31 days in a"+year);
                    a=12;
                    break;
                default:
                    System.out.println("Invalid Entry");



            }
            return a;
        }

    }


}