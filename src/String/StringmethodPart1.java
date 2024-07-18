package String;

public class StringmethodPart1 {

    public static void main(String[] args) {
        
        String text = "Education is the key";

        String text2 = " We are just having fun";

        // char ch = text.charAt(5);

        // System.out.println(ch);
        // System.out.println(text.charAt(4));

        // System.out.println(text.charAt(200));

        // String text2 = text.concat(" to success").concat(" and we are learning java");

        // System.out.println(text2);

        System.out.println(text.contains("Key")); // it is case sensitive.

        System.out.println("Message ends with fun: " + text2.endsWith("Fun"));


    }

}
