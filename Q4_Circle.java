/*circle
by Janvi Agravat
this program reads radius of a circle and prints its diameter, circumference and area */

import java.util.Scanner;

public class Q4_Circle {
    public static void main(String args[])
    {
        double pi = Math.PI;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int rad = sc.nextInt();
        int diam = 2*rad;
        double circum = 2*pi*rad;
        double area = pi*rad*rad;

        System.out.println("Diameter = "+diam);
        System.out.println("Circumference = "+circum);
        System.out.println("Area = "+area);

        sc.close(); 
    }
}
