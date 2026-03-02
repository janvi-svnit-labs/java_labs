package Car;

public class Maruti extends Car{
    Maruti(String name)
    {
        super(name);
    }
    public void mode(String model)
    {
        System.out.println("Model of car: "+model);
    }
    public void avg(double avg)
    {
        System.out.println("Average of car: "+avg);
    }
}
