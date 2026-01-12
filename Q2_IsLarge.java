/*IsLarge 
by janvi agravat
this program reads 2 numbers and prints the larger one among them */

import java.util.Scanner;

public class Q2_IsLarge {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();

        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
    
        if(a==b)
        {
            System.out.println("Both are equal");
        }
        else if (a>b) 
        {
            System.out.println(a+" is large");
        }
        else
        {
            System.out.println(b+" is large");
        }
        sc.close();
    }
}
