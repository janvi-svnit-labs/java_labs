package Point3D;
import java.util.Scanner;

public class Point3DExecute {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter coordinates of 1st point: ");
        System.out.println("x1= ");
        int x1=sc.nextInt();
        System.out.println("y1= ");
        int y1=sc.nextInt();
        System.out.println("z1= ");
        int z1=sc.nextInt();

        System.out.println("Enter coordinates of 2nd point: ");
        System.out.println("x2= ");
        int x2=sc.nextInt();
        System.out.println("y2= ");
        int y2=sc.nextInt();
        System.out.println("z2= ");
        int z2=sc.nextInt();

        Point3D p1=new Point3D(x1, y1, z1);
        Point3D p2=new Point3D(x2, y2, z2);

        System.out.print("p1= ");
        p1.display();
        System.out.println("p2= ");
        p2.display();

        double distance=p1.distanceCalculate(x1, y1, z1, x2, y2, z2);

        System.out.println("Distance= "+distance);

        sc.close();
    }
}
