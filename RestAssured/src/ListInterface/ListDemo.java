package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List l1 = new ArrayList();
		
		l1.add(0, 465);
		l1.add(1, 4);
		System.out.println(l1);
		
		List l2 = new ArrayList();
		l2.add(10);
		l2.add(465);
		l2.add(465);
		l2.add(10);
		l2.add(19);
		
		l1.addAll(0, l2);
		System.out.println(l1);

		// l1.remove(5);
		/*
		 * System.out.println(l1); System.out.println("Index present at 3rd index is: "
		 * + l1.get(3)); l1.set(4, 896);
		 * System.out.println("Array List after set operation: " + l1);
		 */
		
		
		/*
		 * System.out.println(l1.indexOf(19)); System.out.println(l1.lastIndexOf(19));
		 */
		
		List l3 = new ArrayList();
		l3 = l1.subList(0, 3);
		
		System.out.println("Partial List: " + l3);
		
		
	}

}
