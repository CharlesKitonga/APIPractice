package iterators;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++){
            al.add(i);
        }
        System.out.println("Elements of the array list: " + al);
        
        ListIterator<Integer> ltr = al.listIterator();
        System.out.println("Starting the Iterator");

        // check the next element availability
        while (ltr.hasNext()) {
            // move cursor to the next element
            int i = (Integer) ltr.next();
            // Get even elements one by one
            System.out.println(i + " ");
            // Remove odd elements
            if(i % 2 == 0){
                i++;
                ltr.set(i); // set method to change value
                ltr.add(i);
            }
        }
        System.out.println();
        System.out.println("Elements after modification"+ al);

	}

}
