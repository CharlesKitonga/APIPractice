package String;

public class StringMethodsPart2 {

    public static void main(String[] args) {

        String text = "TechTraining";

        String text1 = "techTrainig";

        String text2 = "TechTraining";

        String text3 = "TechTrainingOne";

        System.out.println(text.equals(text1));
        
        System.out.println(text.equals(text2));
        
        System.out.println(text.equalsIgnoreCase(text2));
        
        System.out.println(text3.indexOf("one"));

        System.out.println(text3.lastIndexOf("i"));

        System.out.println(text.length());


        
    }

}
