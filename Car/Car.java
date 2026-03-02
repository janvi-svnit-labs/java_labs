package Car;

public abstract class Car {
    String name;
    Car(String name){
        this.name=name;
        System.out.println("Car brand name is "+name);
    }
    public abstract void mode(String model);
    public abstract void avg(double avg);
}
