/*Multilevel Inheritance
by Janvi Agravat */

import java.util.Scanner;

class X
{
    int i;
    int j;
    X(int i, int j)
    {
        this.i=i;
        this.j=j;
    }
    public int sumTwo()
    {
        return i+j;
    }
}

class Y extends X
{
    Y(int i, int j)
    {
        super(i, j);
    }
    public int prod()
    {
        return (i*j);
    }
}

class Z extends Y
{
    Z(int i, int j)
    {
        super(i, j);
    }
    public int diff()
    {
        return (i-j);
    }
}

public class Q16l3_MultilvlInheritance
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st integer: ");
        int i=sc.nextInt();
        System.out.println("Enter 2nd integer: ");
        int j=sc.nextInt();

        Z z = new Z(i, j);
        System.out.println("sum: "+z.sumTwo());
        System.out.println("diff: "+z.diff());
        System.out.println("prod: "+z.prod());

        sc.close();
    }
}
