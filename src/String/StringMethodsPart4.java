package String;

public class StringMethodsPart4 {

    public static void main(String[] args) {
        
        String text = "Republic of Kenya";
        String text1 = "My name is          ";
        String text2 = "Kyalo";


        // System.out.println(text.substring(5));
        // System.out.println(text.substring(4, 8));
        // System.out.println(text.substring(2, 200));

        // char[] charArray = text.toCharArray();

        // System.out.println("Main Sting is: " + text);

        // for(int a=0; a<charArray.length; a++){
        //     System.out.println(charArray[a]);
        // }

        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());

        System.out.println(text1 + text2);
        System.out.println(text1.trim() + text2);


    }

}
