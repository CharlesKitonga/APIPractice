package iterators;

import java.util.Enumeration;
import java.util.Vector;

public class EnumarationTest {
    public static void main(String[] args) {
        // Create a vector and print it's contents
        Vector v = new Vector();
        for(int i = 0; i < 10; i++){
            v.addElement(i);
        }
        System.out.println(v);

        //At the beginning e(cursor) will point to index just before the first element in v
        Enumeration e = v.elements();

        // Check the next element availability:
        while(e.hasMoreElements()){
            // Move cursor to the next element
            int i = (Integer) e.nextElement();
            System.out.println(i + " ");
        } 
    }
}
