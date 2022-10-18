package jvhomeworkpradipkakadiya;
/* WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
| Salary Slip |
|______________________________|
| Employee Id : 2564 |
| Employee Name : Jay |
|______________________________|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|______________________________|
| Gross Salary : 26750.0 |
|===========================|
*/
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        data();
        salaryslip();
    }

    public static void data() {
        Question5 obj = new Question5();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee id:");
        System.out.print("Name:");
        System.out.print("Basic salary:");
    }

    public static void salaryslip() {
        Question5 obj = new Question5();
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String name = scanner.next();
        int basic = scanner.nextInt();
        int hra = basic * 10 / 100;
        int ta = basic * 9 / 100;
        int da = basic * 8 / 100;
        int pf = basic * 20 / 100;
        int gross = basic + hra + ta + da - pf;
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.println("|               Salary Slip                    |");
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.println("|Employee id:                          " + id   );
        System.out.println("|Employee name:                        " + name);
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.println("|Employee basic salary:                " + basic);
        System.out.println("|Employee DA:                          " + da);
        System.out.println("|Employee TA:                          " + ta);
        System.out.println("|Employee HRA:                         " + hra);
        System.out.println("|Employee PF:                          " + pf);
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.println("|Employee Gross salary:               " + gross);
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");

    }
}
