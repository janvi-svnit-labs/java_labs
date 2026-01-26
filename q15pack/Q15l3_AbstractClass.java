/*Abstract class Figures
by Janvi Agravat */

package q15pack;

import java.util.Scanner;

abstract class Figures
{
    double pi=3.1415;
    double a;
    double v;
    public abstract void calcArea();
    public abstract void calcVol(); 
    public abstract void dispArea();
    public abstract void dispVol();
}

class Cone extends Figures
{
    private double r;
    private double h;

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

    public void setR(double r) {
        if(r>0)
            this.r = r;
        else
            this.r=0;
    }
    public void setH(double h) {
        if(h>0)
            this.h = h;
        else
            this.h=0;
    }
    public double getR() {
        return r;
    }public double getH() {
        return h;
    }public double getS() {
        return Math.sqrt(r*r + h*h);
    }
}

class Sphere extends Figures
{
    private double r;
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

    public void setR(double r) {
        if(r>0)
            this.r = r;
        else
            this.r=0;
    }
    public double getR() {
        return r;
    }
}

class Cylinder extends Figures
{
    private double r;
    private double h;
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

    public void setR(double r) {
        if(r>0)
            this.r = r;
        else
            this.r=0;
    }
    public void setH(double h) {
        if(h>0)
            this.h = h;
        else
            this.h=0;
    }

    public double getR() {
        return r;
    }
    public double getH() {
        return h;
    }
}
public class Q15l3_AbstractClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cone cone = new Cone();
        Sphere sph = new Sphere();
        Cylinder cyl = new Cylinder();

        System.out.println("Cone class: ");
        System.out.println("Enter radius: ");
        cone.setR(sc.nextDouble());
        System.out.println("Enter height: ");
        cone.setH(sc.nextDouble());

        cone.calcArea();
        cone.calcVol();
        cone.dispArea();
        cone.dispVol();

        System.out.println("sphere class: ");
        System.out.println("Enter radius: ");
        sph.setR(sc.nextDouble());
        
        sph.calcArea();
        sph.calcVol();
        sph.dispArea();
        sph.dispVol();

        System.out.println("cylinder class: ");
        System.out.println("Enter radius: ");
        cyl.setR(sc.nextDouble());
        System.out.println("Enter height: ");
        cyl.setH(sc.nextDouble());

        cyl.calcArea();
        cyl.calcVol();
        cyl.dispArea();
        cyl.dispVol();

        sc.close();
    }
}
