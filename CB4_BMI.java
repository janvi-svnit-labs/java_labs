import java.util.Scanner;
public class CB4_BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();
        weight=Math.abs(weight);
        double w=weight*0.45359237;

        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();
        height=Math.abs(height);
        double h=height*0.0254;

        double bmi = (w)/(h*h);

        System.out.printf("BMI is: " +bmi);

        sc.close();
    }
}