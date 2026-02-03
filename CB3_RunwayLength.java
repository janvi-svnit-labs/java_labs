import java.util.Scanner;
public class CB3_RunwayLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double v = sc.nextDouble();
        double a = sc.nextDouble();

        double d = (v*v)/(2*a);

        System.out.printf("The minimum runway length for this airplane is: " +d+ " m.");

        sc.close();
    }
}