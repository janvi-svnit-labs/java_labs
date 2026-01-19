/*Parking
by Janvi Agravat
this program calculates the charge for parking vehicles*/

import java.util.Scanner;

public class Q13l2_Parking {
    public static double ParkingCharge(int hrs)
    {
        double charge=0;
        if(hrs<=3)
            charge = (double)(hrs*2);
        if(hrs>3 && hrs<25)
            charge = (double)(6+((hrs-3)*0.5));

        if(charge>=10)
            charge=10;

        return charge;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of customers: ");
        int customers = sc.nextInt();

        double total_reciept=0;

        for(int i=0; i<customers; i++)
        {
            System.out.println("Enter hours parked: ");
            int hrs=sc.nextInt();

            System.out.println("total charge: "+ParkingCharge(hrs));
            total_reciept+=ParkingCharge(hrs);
        }
        System.out.println("Enter the total reciepts: "+total_reciept);

        sc.close();
    }
}
