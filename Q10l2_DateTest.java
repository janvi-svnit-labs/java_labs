/*date test
by Janvi Agravat*/

import java.util.Scanner;

class Date{
    private int day;
    private int month;
    private int year;

    //constructor
    Date(int day, int month, int year)
    {
        setday(day);
        setmonth(month);
        setyear(year);
    }

    //setters
    public void setday(int day)
    {
        if(day>0 && day<32)
            this.day=day;
        else
            this.day=0;
    }
    public void setmonth(int month)
    {
        if(month>0 && month<13)
            this.month=month;
        else
            this.month=0;
    }
    public void setyear(int year) 
    {
        if(year>0)
            this.year = year;
        else
            this.year = 0;
    }

    //getters
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    void displayDate()
    {
        System.out.print(day+"/"+month+"/"+year); //displaying date in the form dd/mm/yyyy
    }
}


public class Q10l2_DateTest{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day: ");
        int day=sc.nextInt();
        System.out.println("Enter month: ");
        int month=sc.nextInt();
        System.out.println("Enter year: ");
        int year = sc.nextInt();

        Date date = new Date(day, month, year);
        date.displayDate();

        sc.close();
    }
}