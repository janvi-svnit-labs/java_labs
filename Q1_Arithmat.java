/*arithmatic operations
by Janvi Agravat
this program takes 2 numbers as input and prints its sum, difference, product and
quotient*/

import java.util.Scanner;

public class Q1_Arithmat {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in); //sc is a object we define

        System.out.print("Enter first number: ");
        int a = sc.nextInt(); //nextInt() is a library defined method in scanner class

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("sum = " + (a+b));
        System.out.println("difference = " + (a-b));
        System.out.println("product = " + (a*b));
        System.out.println("quotient = " + ((double)a/b));

        sc.close(); //we need to close sc because we are also 
                    // using resources like keyboard for input
    }
}
