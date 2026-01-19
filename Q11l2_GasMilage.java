/*Gas Milage
by Janvi Agravat
this prograam takes miles and gallons per each trip as inputs and displays milage for each trip
as well as avg milage of all trips. it also uses sentinel controlled repetition*/

import java.util.Scanner;

class GasData{
    private float miles;
    private float gallons;

    public GasData(float miles, float gallons)
    {
        setMiles(miles);
        setGallons(gallons);
    }

    //setters
    public void setMiles(float miles) {
        if(miles>0)
            this.miles = miles;
        else
            this.miles=0;
    }
    public void setGallons(float gallons) {
        if(miles>0)
            this.gallons = gallons;
        else
            this.gallons=0;
    }

    //getters
    public float getMiles() {
        return miles;
    }
    public float getGallons() {
        return gallons;
    }

    float milesPerGal()
    {
        return miles/gallons;
    }

}

 public class Q11l2_GasMilage
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num;
        float comb_miles=0, comb_gals=0;

        System.out.print("Enter a number (-1 to stop): ");
        num = sc.nextInt();

        //sentinal-controlled repetition. here sentinel is -1
        //the loop will run until -1 is input by the user
        while (num!=-1) 
        {
            System.out.println("Enter number of miles: ");
            float miles = sc.nextFloat();
            System.out.println("Enter Gallons of gas used: ");
            float gallons= sc.nextFloat(); 
            GasData trip = new GasData(miles, gallons);

            //to calculate the combines miles and gallons of each trip
            comb_miles=comb_miles+miles;
            comb_gals=comb_gals+gallons;
            
            System.out.println("Miles per gallons, Milage: "+trip.milesPerGal());
            System.out.println("Enter number: ");
            num = sc.nextInt();
        }
        System.out.println("avg milage of all trips: "+comb_miles/comb_gals);

        sc.close();
    }
 }