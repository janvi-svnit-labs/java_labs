package WashingMachine;
import UserDefinedExceptions.NoNegative;
import java.util.Scanner;
class WashingMachine
{
    int noClothes;
    public void SwitchOn()
    {
        System.out.println("Machine chalu thai gyu");
    }
    public void acceptClothes()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of clothes");
        int noClothes=sc.nextInt();
        if(noClothes<0)
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
    }
    public void acceptDetergent()
    {
        System.out.println("Powder nakhai gyo");
    }

    public void switchOff()
    {
        System.out.println("kapda fari gya");
    }
}
