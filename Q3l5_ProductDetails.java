import java.util.Scanner;

class Product {
    String ProductId;
    String Name;
    String CategoryId;
    float UnitPrice;

    // constructor
    Product(String ProductId, String Name, String CategoryId, float UnitPrice) {
        this.ProductId = ProductId;
        this.Name = Name;
        this.CategoryId = CategoryId;
        this.UnitPrice = UnitPrice;
    }

    void Display() {
        System.out.println("Product ID   : " + ProductId);
        System.out.println("Name         : " + Name);
        System.out.println("Category ID  : " + CategoryId);
        System.out.println("Unit Price   : " + UnitPrice);
    }

}

class ElectricalProduct extends Product {
    int RangeS, RangeE, Wattage;

    // constructor
    ElectricalProduct(String ProductId, String Name, String CategoryId, float UnitPrice, int RangeS, int RangeE,
            int Wattage) {
        super(ProductId, Name, CategoryId, UnitPrice);
        this.RangeS = RangeS;
        this.RangeE = RangeE;
        this.Wattage = Wattage;

    }

    // update
    void updateDetails(int newWattage, float newPrice) {
        Wattage = newWattage;
        UnitPrice = newPrice;
    }

    void Display() {
        super.Display();
        System.out.println("Voltage Range: " + RangeS + "V - " + RangeE + "V");
        System.out.println("Wattage      : " + Wattage + "W");
    }

}

public class Q3l5_ProductDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElectricalProduct p1 = new ElectricalProduct("P034", "IPHONE", "I034", 1199.0f, 8, 14, 40);
        System.out.println("Original Product Details:");
        p1.Display();
        
        // new details
        System.out.print("\nEnter new wattage: ");
        int w = sc.nextInt();

        System.out.print("Enter new price: ");
        float p = sc.nextFloat();

        p1.updateDetails(w, p);

        System.out.println("\nUpdated Product Details:");
        p1.Display();

        sc.close();

    }

}
