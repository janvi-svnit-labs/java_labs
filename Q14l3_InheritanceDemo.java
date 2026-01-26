/*Inheritance demo
by Janvi Agravat*/

import java.util.Scanner;

class Figure
{
    private double r;
    private double a;
    private double v;

    public void dispArea()
    {
        System.out.println("value of area: "+ a);
    }
    public void dispVolume()
    {
        System.out.println("value of volume: "+ v);
    }

    //setters
    public void setR(double r) {
        if(r>0)
            this.r = r;
        else
            this.r=0;
    }
    public void setA(double a) {
        this.a = a;
    }
    public void setV(double v) {
        this.v = v;
    }

    //getters
    public double getR()
    {
        return r;
    }
    public double getA()
    {
        return a;
    }
    public double getV() {
        return v;
    }
}

class Cone extends Figure
{
    private double h;

    public void calcArea()
    {
        setA((Math.PI*getR()*(getR()+getS())));
    }
    public void calcVolume()
    {
        setV((1d/3)*Math.PI*getR()*getR()*h);
    }

    public void setH(double h) {
        if (h>0)
            this.h = h;
        else
            this.h=0;
    }
    public double getS() {
        return Math.sqrt(getR()*getR() + h*h);
    }

    public double getH() {
        return h;
    }

}

public class Q14l3_InheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cone cone=new Cone();

        System.out.println("Enter radius: ");
        cone.setR(sc.nextDouble());
        System.out.println("Enter height: ");
        cone.setH(sc.nextDouble());
        
        cone.calcArea();
        cone.calcVolume();
        cone.dispArea();
        cone.dispVolume();

        sc.close();
    }
}
