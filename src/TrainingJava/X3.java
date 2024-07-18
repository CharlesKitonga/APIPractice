package TrainingJava;

public class X3 extends Bmw{
    
    static String model = "X3 ";
    public static void main(String[] args){

        Bmw bmw = new Bmw();

        System.out.println("Model is " + model);
        // System.out.println("Brand is " + name); 

        System.out.println("Beahviour is ");
        bmw.run();

    }
}
