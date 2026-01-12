/*operations
by Janvi Agravat
this program reads3 numbers and prints sum, avg, prod, largest and smallest among them */

import java.util.Scanner;

public class Q3_Operations {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();

        int sum = a+b+c;
        int avg = sum/3;
        int prod = a*b*c;
        int large = (a>b)?a:b;
        int small = (a<b)?a:b;

        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);
        System.out.println("Product = "+prod);
        System.out.println("Larger number = "+large);
        System.out.println("Small = "+small);

        sc.close();
    }
}
