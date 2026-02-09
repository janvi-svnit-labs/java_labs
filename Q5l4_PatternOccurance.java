import java.util.Scanner;

public class Q5l4_PatternOccurance {

    public static int countOccurrences(int a, int b, String n) {
        int count=0;

        String s2=String.valueOf(n);
        for(int i=a;i<=b;i++){
            String s1=String.valueOf(i);
            if(s1.contains(s2)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter range: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        System.out.println("Enter pattern: ");
        int intPattern=sc.nextInt();

        String pattern=String.valueOf(intPattern);

        int occurance=countOccurrences(n1, n2, pattern);
        System.out.println("The pattern repeated "+occurance+" times");

        sc.close();
    }
}
