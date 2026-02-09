import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q4l4_PerfectString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        int flag=0;

        Map<Character, Integer> freq = new HashMap<>();

        for (char c : str.toCharArray()) 
        {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) 
        {
            if (entry.getValue() > 1) 
            {
                flag = 1;
            }
        }
        if(flag==1)
        {
            System.out.print("not a perfect string");
        }
        else
        {
            System.out.print("perfect string");
        }

        sc.close();
    }
}
