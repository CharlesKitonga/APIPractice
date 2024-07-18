package JavaCollection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample {

    public static void main(String[] args){
        ArrayList al = new ArrayList();

        for(int i = 0; i < 10; i++){
            al.add(i);
        }
        System.out.println("Elements of the array list: " + al);
        
        Iterator itr = al.iterator();
        System.out.println("Starting the Iterator");

        // check the next element availability
        while (itr.hasNext()) {
            // move cursor to the next element
            int i = (Integer) itr.next();
            // Get even elements one by one
            System.out.println(i + " ");
            // Remove odd elements
            if(i % 2 != 0){
                itr.remove();
            }
        }
        System.out.println();
        System.out.println("Elements after remove operation"+ al);
        
    }
  
}
