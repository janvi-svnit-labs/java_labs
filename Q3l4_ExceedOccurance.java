import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q3l4_ExceedOccurance {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();

        System.out.print("Enter the number: ");
        int n=sc.nextInt();

        Map<Character, Integer> freq = new HashMap<>();

        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() >= n) {
                System.out.print(entry.getKey());
            }
        }
        sc.close();
    }
}
