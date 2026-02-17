import java.util.Scanner;

class Fruit {
    String Name;
    int quant;
    float price;

    // Fruit(String Name, int size, float price) {// constructor
    //     this.Name = Name;
    //     this.quant = quant;
    //     this.price = price;
    // }

    void displayFruit() {// method
        System.out.println("Name: " + Name);
        System.out.println("Size: " + quant);
        System.out.println("Price: " + price);
    }
}

public class Q4l5_FruitsClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Fruit f1 = new Fruit();
        Fruit f2 = new Fruit();
        System.out.println("Enter 1st fruit name: ");
        f1.Name=sc.nextLine();
        System.out.println("Enter quantity: ");
        f1.quant=sc.nextInt();
        System.out.println("Enter price: ");
        f1.price=sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter 2nd fruit name: ");
        f2.Name=sc.nextLine();
        System.out.println("Enter quantity: ");
        f2.quant=sc.nextInt();
        System.out.println("Enter price: ");
        f2.price=sc.nextFloat();

        f1.displayFruit();
        System.out.println();
        f2.displayFruit();

        sc.close();
    }

}