import java.util.Scanner;

class Tax {
    int hourly;
    int overtime;

    void NetPay(int hourly, int overtime) {
        int GrossPay = (12 * hourly) + overtime;
        int tax = GrossPay * 15 / 100;
        int netpay = GrossPay - tax;

        System.out.println("Net payment of person is " + netpay);
    }
}

public class Q5l5_Taxes {
    public static void main(String[] args) {
        Tax person = new Tax();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of hours you worked");
        int h = sc.nextInt();
        System.out.println("Enter overtime if any or type 0");
        int o = sc.nextInt();

        person.NetPay(h, o);

        sc.close();
    }

}
