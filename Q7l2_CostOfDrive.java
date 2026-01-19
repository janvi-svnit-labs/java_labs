import java.util.Scanner;

class driveInfo
{
    double miles;
    double gasoline;
    double avg_fee;
    double tolls;
    driveInfo(double m, double g, double avgf, double t)
    {
        miles=m;
        gasoline=g;
        avg_fee=avgf;
        tolls = t;
    }
    double driveAmount()
    {
        return ((miles*gasoline)+avg_fee+tolls);
    }
}

public class Q7l2_CostOfDrive 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter trip details: ");
        System.out.println("Enter miles driven per day: ");
        double m = sc.nextDouble();
        System.out.println("Enter gasoline per gallon: ");
        double g = sc.nextDouble();
        System.out.println("Enter avg fees: ");
        double avgf = sc.nextDouble();
        System.out.println("Enter tolls paid: ");
        double t = sc.nextDouble();

        driveInfo di = new driveInfo(m, g, avgf, t);
        double total_amount = di.driveAmount();
        System.out.println("total amount of driving everyday = "+total_amount);

        sc.close();
    }
}
