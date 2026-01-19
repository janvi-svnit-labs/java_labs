/*employee 
by Janvi Agravat*/

import java.util.Scanner;

class Employe
{
    private String name;
    private String last_name;
    private double salary;
    
    //constructor
    public Employe(String name, String last_name, double salary)
    {
        setname(name);
        setlname(last_name);
        setsal(salary);
    }

    //setters
    public void setname(String name)
    {
        if (name != null && !name.isEmpty())
            this.name= name;
        else
            this.name = "NA";
    }
    public void setlname(String last_name)
    {
        if (last_name != null && !last_name.isEmpty())
            this.last_name= last_name;
        else
            this.last_name = "NA";
    }
    public void setsal(double salary)
    {
        if(salary>0)
            this.salary=salary;
        else
            this.salary=0;
    }

    //getters
    public String getName() {
        return name;
    }
    public String getLast_name() {
        return last_name;
    }
    public double getSalary() {
        return salary;
    }
}

public class Q9l2_Employee {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee details: \nemployee 1: ");
        System.out.println("enter employee name: ");
        String name1 = sc.nextLine();
        System.out.println("Enter last name: ");
        String last_name1 = sc.nextLine();
        System.out.println("Enter yearly salary: ");
        Double salary1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("employee 2: ");
        System.out.println("enter employee name: ");
        String name2 = sc.nextLine();
        System.out.println("Enter last name: ");
        String last_name2 = sc.nextLine();
        System.out.println("Enter yearly salary: ");
        Double salary2 = sc.nextDouble();        
        sc.nextLine();

        //object creation
        Employe e1=new Employe(name1, last_name1, salary1);
        Employe e2=new Employe(name2, last_name2, salary2);

        System.out.println("Salary of both: \nEmployee 1: "+e1.getSalary()+"\nEmployee 2: "+e2.getSalary());
        
        e1.setsal(salary1+(salary1*0.1));
        e2.setsal(salary2+(salary2*0.1));
        System.out.println("After 10% increament: ");
        System.out.println("Salary of both: \nEmployee 1: "+e1.getSalary()+"\nEmployee 2: "+e2.getSalary());
        
        sc.close();
    }
}
