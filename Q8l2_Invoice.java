import java.util.Scanner;

class Invoice
{
    private String part_num;
    private String part_desc;
    private int quant;
    private double price;

    //constructor
    public Invoice(String part_num, String part_desc, int quant, double price)
    {
        //calling setters with constructors
        setpartnum(part_num);
        setpartdesc(part_desc);
        setquant(quant);
        setprice(price);
    }
    // Setter
    public void setpartnum(String part_num) {
        if (part_num != null && !part_num.isEmpty())
            this.part_num = part_num;
        else
            this.part_num = "NA";
    }
    public void setpartdesc(String part_desc) {
        if (part_desc != null && !part_desc.isEmpty())
            this.part_desc = part_desc;
        else
            this.part_desc = "NA";
    }
    public void setquant(int quant) {
        if (quant > 0)
            this.quant = quant;
        else
            this.quant = 0;
    }
    public void setprice(double price) {
        if (price > 0)
            this.price = price;
        else
            this.price = 0;
    }

    // Getter
    public String getpartnum() {
        return part_num;
    }
    public String getpartdesc() {
        return part_desc;
    }
    public int getquant() {
        return quant;
    }
    public double getprice() {
        return price;
    }

    //method
    double getInvoiceAmount()
    {
        return quant*price;
    }
}

public class Q8l2_Invoice {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter product details: ");
        System.out.println("Enter part number: ");
        String pn = sc.nextLine();
        System.out.println("Enter part description: ");
        String pd = sc.nextLine();
        System.out.println("Enter quantity: ");
        int q = sc.nextInt();
        System.out.println("Enter price per piece: ");
        double pr = sc.nextDouble();

        //object creation
        Invoice in = new Invoice(pn, pd, q, pr);
        double amount = in.getInvoiceAmount();

        System.out.println("total amount: "+amount);
        sc.close();
    }
}
