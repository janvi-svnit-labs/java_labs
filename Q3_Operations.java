/*operations
by Janvi Agravat
this program reads3 numbers and prints sum, avg, prod, largest and smallest among them */

import java.util.Scanner;

abstract class Operations {
    abstract void sum(int a, int b, int c);

    abstract void average(int a, int b, int c);

    abstract void product(int a, int b, int c);

    abstract void smallest(int a, int b, int c);

    abstract void largest(int a, int b, int c);
}

class Operation extends Operations {
    public void sum(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum: " + sum);
    }

    public void average(int a, int b, int c) {
        double average = (a + b + c) / 3.0;
        System.out.println("Average: " + average);
    }

    public void product(int a, int b, int c) {
        int product = a * b * c;
        System.out.println("Product: " + product);
    }

    public void smallest(int a, int b, int c) {
        if (a <= b && a <= c) {
            System.out.println(a + " is smallest");
        } else if (b <= c && b <= a) {
            System.out.println(b + " is smallest");
        } else
            System.out.println(a + " is smallest");
    }

    public void largest(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println(a + " is largest");
        } else if (b >= c && b >= a) {
            System.out.println(b + " is largest");
        } else
            System.out.println(c + " is largest");
    }
}

public class Q3_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations opt = new Operation();
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        opt.sum(a, b, c);
        opt.average(a, b, c);
        opt.product(a, b, c);
        opt.smallest(a, b, c);
        opt.largest(a, b, c);

        sc.close();
    }
}
