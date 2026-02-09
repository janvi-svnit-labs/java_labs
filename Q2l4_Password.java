import java.util.Scanner;

public class Q2l4_Password {

    public static boolean ValidPass(String password)
    {
            if(password.length()>12 || password.length()<5)
            {
                System.out.println("Password should have 5-12 characters. Try again");
                return false;
            }

            if(!password.matches("^[a-z0-9]+$"))
            {
                System.out.println("The password must not contain any upper case character or special character");
                return false;
            }

            if(!password.matches(".*\\d.*"))
            {
                System.out.println("Must contain atleast one digit");
                return false;
            }

            if(!password.matches(".*[a-z].*"))
            {
                System.out.println("Must contain atleast one lower case character");
                return false;
            }
            
            int n = password.length();
            for (int len = 1; len <= n / 2; len++) 
            {
                for (int i = 0; i + 2 * len <= n; i++)
                {
                    String first = password.substring(i, i + len);
                    String second = password.substring(i + len, i + 2 * len);
                    if (first.equals(second)) 
                    {
                        System.out.println("The password must not contain any immediate repeating pattern");
                        return false;
                    }
                }
            }

            return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.print("Enter your password: ");
            String password=sc.nextLine();

            if(ValidPass(password))
            {
                System.out.println("password is valid!");
                break;
            }
        }
        sc.close();
    }
}
