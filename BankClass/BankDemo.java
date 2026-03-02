package BankClass;
import UserDefinedExceptions.*;
import java.util.Scanner;

public class BankDemo
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter account balance: ");
        double balance = sc.nextDouble();
        if(balance<0)
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
        System.out.println("enter 1 for deposit or 2 for withdraw: ");
        int choice = sc.nextInt();
        if(choice!=1 && choice!=2)
        {
            try{
                throw new ChoiceException("ChoiceInvalid");
            }
            catch(ChoiceException ex)
            {
                ex.printStackTrace();
                System.exit(0);
            }
        }
        System.out.println("Enter amount: ");
        double amount=sc.nextDouble();

        if(amount<0)
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

        if(amount>balance)
        {
            try{
                throw new BankBalanceException("BalanceNotEnough");
            }
            catch(BankBalanceException ex)
            {
                ex.printStackTrace();
            }
        }

        Bank hdfc=new Bank();

        if(choice ==1)
        {
            balance=hdfc.deposit(balance, amount);
        }
        if(choice==2)
        {
            balance=hdfc.withdraw(balance, amount);
        }

        System.out.println("New Balance: "+balance);

        sc.close();
    }
}