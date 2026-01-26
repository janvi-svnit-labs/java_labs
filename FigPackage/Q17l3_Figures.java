/*Figures 
by Janvi Agravat */

package FigPackage;

import java.util.Scanner;

abstract class Figures{
    double a;
    double v;
    double r;
    double pi=3.1428;
    Figures(double r)
    {
        this.r=r;
    }
    public abstract void calcArea(); 
    public abstract void calcVol(); 
    public abstract void dispArea();
    public abstract void dispVol(); 
}

class Cone extends Figures{
    double h;
    Cone(double r, double h)
    {
        super(r);
        this.h=h;
    }
    public void calcArea()
    {
        a=(pi*r*(r+getS()));
    }
    public void calcVol()
    {
        v=(1d/3)*pi*r*r*h;
    }

    public void dispArea()
    {
        System.out.println(a);
    }
    public void dispVol()
    {
        System.out.println(v);
    }
    public double getS()
    {
        return Math.sqrt(r*r + h*h);
    }
}

class Sphere extends Figures
{
    Sphere(double r)
    {
        super(r);
    }

    public void calcArea()
    {
        a=4*pi*r*r;
    }
    public void calcVol()
    {
        v=(4d/3)*pi*r*r*r;
    }

    public void dispArea()
    {
        System.out.println(a);
    }
    public void dispVol()
    {
        System.out.println(v);
    }
}

class Cylinder extends Figures
{
    double h;
    Cylinder(double r, double h)
    {
        super(r);
        this.h=h;
    }
    public void calcArea()
    {
        a=2*pi*r*(r+h);
    }
    public void calcVol()
    {
        v=pi*r*r*h;
    }
    public void dispArea()
    {
        System.out.println(a);
    }
    public void dispVol()
    {
        System.out.println(v);
    }
}

public class Q17l3_Figures {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Cone class: ");
        System.out.println("Enter radius: ");
        double r=sc.nextDouble();
        System.out.println("Enter height: ");
        double h=sc.nextDouble();

        Cone cone = new Cone(r, h);

        cone.calcArea();
        cone.calcVol();
        cone.dispArea();
        cone.dispVol();

        System.out.println("sphere class: ");
        System.out.println("Enter radius: ");
        r=sc.nextDouble();

        Sphere sph = new Sphere(r);
        
        sph.calcArea();
        sph.calcVol();
        sph.dispArea();
        sph.dispVol();

        System.out.println("cylinder class: ");
        System.out.println("Enter radius: ");
        r=sc.nextDouble();
        System.out.println("Enter height: ");
        h=sc.nextDouble();

        Cylinder cyl = new Cylinder(r, h);

        cyl.calcArea();
        cyl.calcVol();
        cyl.dispArea();
        cyl.dispVol();

        sc.close();
    }
}
