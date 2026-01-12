/*digits
by Janvi Agravat
this program reads a 5 digit number and then splits the digits to print them seperately */

import java.util.Scanner;

public class Q5_Digits 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 5 digit number: ");
        int num = sc.nextInt();
        int[] arr_num = new int[5];
        int i=4;
        while (num>0 && i>=0)
        {
            int q=num%10;
            arr_num[i]=q;
            num = num/10;
            i=i-1;
        }
        for (int j = 0; j < arr_num.length; j++) 
        {
            System.out.print(arr_num[j]+"  ");
        }
        sc.close();
   }
}
