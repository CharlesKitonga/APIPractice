package TrainingJava;
 

public class Car {

    Car(){
        System.out.println("Creating constructor of a car class");
    }

    public final void setWheels(){
        System.out.println("Only 4 wheels are allowed");
    }

    String name = "Car Segment ";
    
    public void run(){
        System.out.println("Car is moving");
    }

    
}
