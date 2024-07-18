package TrainingJava;

public class Triangle extends Shape {

    public void displayShape() {
        
        System.out.println("The Shape is triangle");
    }

    public static void main(String[] args){

        Shape sp = new Circle();
        sp.displayShape();

        Shape tr = new Triangle();
        tr.displayShape();
    }
    
}
