package Car;
import java.util.Scanner;
import UserDefinedExceptions.NoNegative;

public class Car1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter model of car 1: ");
        String M1=sc.nextLine();
        System.out.println("Enter average of car 1: ");
        double A1=sc.nextDouble();
        sc.nextLine(); 

        if(A1<0)
        {
            try{
                throw new NoNegative("NegativeInput");
            }
            catch(NoNegative ex)
            {
                ex.printStackTrace();
                System.exit(0);
            }
        }

        System.out.println("Enter model of car 2: ");
        String M2=sc.nextLine();
        System.out.println("Enter average of car 2: ");
        double A2=sc.nextDouble();
        
        if(A2<0)
        {
            try{
                throw new NoNegative("NegativeInput");
            }
            catch(NoNegative ex)
            {
                ex.printStackTrace();
                System.exit(0);
            }
        }

        Maruti maruti=new Maruti("Alto800");
        Santro santro=new Santro("i20");

        maruti.mode(M1);
        maruti.avg(A1);
        santro.mode(M2);
        santro.avg(A2);

        sc.close();
    }
}
