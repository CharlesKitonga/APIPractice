package TrainingJava;

public class ChildAddition extends Addition {
    
    public static void main(String[] args){

        Addition add = new Addition();
        add.addValues(5, 10);
        add.addValues(12, 15, 20);

        double d = add.addValues(11.5, 12.47);
        System.out.println(d);
        
    }

}
