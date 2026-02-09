import java.util.Scanner;

interface Function
{
    int evaluate(int i);
}

class Half implements Function
{
    public int evaluate(int i)
    {
        return i/2;
    }
}

class Client extends Half
{
    int[] takeArray(int[] arr)
    {
        int[] res=new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            res[i]=evaluate(arr[i]);
        }
        return res;
    }
}

public class Q6l4_Interface
{
    public static void main(String[] args) {
        Client cl=new Client();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Halved array elements: ");
        int[] res=cl.takeArray(arr);
        for(int i=0; i<n; i++)
        {
            System.out.print(res[i]+"\t");
        }

        sc.close();
    }
}