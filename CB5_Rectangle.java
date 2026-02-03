import java.util.Scanner;

public class CB5_Rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Rectangle r1
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double w1 = sc.nextDouble();
        double h1 = sc.nextDouble();

        // Rectangle r2
        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double w2 = sc.nextDouble();
        double h2 = sc.nextDouble();

        // CORNERS of r1
        double left1 = x1 - (w1 / 2);
        double right1 = x1 + (w1 / 2);
        double bottom1 = y1 - (h1 / 2);
        double top1 = y1 + (h1 / 2);

        // CORNERS of r2
        double left2 = x2 - (w2 / 2);
        double right2 = x2 + (w2 / 2);
        double bottom2 = y2 - (h2 / 2);
        double top2 = y2 + (h2 / 2);

        if (left2 >= left1 && right2 <= right1 && bottom2 >= bottom1 && top2 <= top1) 
        {
            System.out.println("r2 is inside r1");
        } 
        else if (right2 > left1 && left2 < right1 && top2 > bottom1 && bottom2 < top1) 
        {
            System.out.println("r2 overlaps r1");
        } 
        else 
        {
            System.out.println("r2 does not overlap r1");
        }

        sc.close();
    }
}