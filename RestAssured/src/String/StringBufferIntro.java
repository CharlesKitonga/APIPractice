package String;

public class StringBufferIntro {

    public static void main(String[] args) {
        
        String name = "Kyalo";
        name.concat(" Kitonga");

        // System.out.println(name);

        StringBuffer name1 = new StringBuffer("Kyalo");

        // name1.append(" Kitonga");
        // name1.insert(4, "Kitonga");
        // name1.replace(1, 3, "Kitonga");
        // name1.delete(2, 4);
        name1.reverse();

        System.out.println(name1);


    }

}
