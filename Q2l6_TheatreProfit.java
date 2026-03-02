import java.util.Scanner;
import UserDefinedExceptions.NoNegative;

public class Q2l6_TheatreProfit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter nummber of tickets sold: ");
        int customers=sc.nextInt();
        if(customers<0)
        {
            try
            {
                throw new NoNegative("NegativeValueEntered");
            }
            catch(NoNegative ex)
            {
                ex.printStackTrace();
                System.exit(0);
            }
        }

        double revenue=5*customers;
        double loss=20+(customers*0.5);

        double profit=revenue-loss;

        System.out.println("Profit generated is: "+profit);

        sc.close();
    }

}
