package TrainingJava;

public class Bmw extends Car{

    Bmw(){
        // super();
        System.out.println("Bmw Constructor");

    }

    // public void setWheels(){
        
    // }
    
    String name = "BMW ";

    public void getName(){

        System.out.println(name);
        System.out.println(super.name);
    }

    public void run(){
        System.out.println("BMW is moving fast");
        super.run();
    }

    public static void main(String[] args){
        /*Car car = new Car();

        System.out.println(name);
        car.run(); */

        Bmw bmw = new Bmw();

        bmw.run();

    }
}
