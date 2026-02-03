import java.util.Scanner;
public class CB1_Acceleration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial velocity: ");
        double v0 = sc.nextDouble();

        System.out.print("Enter final velocity: ");
        double v1 = sc.nextDouble();

        System.out.print("Enter time: ");
        double t = sc.nextDouble();

        double a = (v1-v0)/t;

        System.out.printf("The acceleration is: " +a+" m/s^2");

        sc.close();
    }
}