import java.util.Scanner;
public class CB2_Energy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight of water: ");
        double M = sc.nextDouble();

        System.out.print("Enter initial temperature: ");
        double T0 = sc.nextDouble();

        System.out.print("Enter final temperature: ");
        double T1 = sc.nextDouble();

        double Q = M*(T1-T0)*4184;

        System.out.printf("The energy needed is: "+Q+" J");

        sc.close();
    }

}