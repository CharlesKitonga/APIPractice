package String;

public class StringIntro {

    public static void main(String[] args) {

        String name = "Kitonga";
        String name1 = "Kitonga";
        String name2 = "kitonga";

        String country = new String("Kenya");
        String country1 = new String("Kenya");

        // System.out.println(name);
        // System.out.println(country);

        // System.out.println(name.equals(name1));
        // System.out.println(name.equals(name2));

        // System.out.println(name.equalsIgnoreCase(name2));

        // System.out.println(name == name1);
        // System.out.println(country == country1);

        String final1 = name + name1 + name2;
        System.out.println(final1);

        String secondStr = name.concat(name1).concat(name2);
        System.out.println(secondStr);
        
    }

}
