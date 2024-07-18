package ListInterface;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList<>();
		
		list.add(25);
		list.add(89);
		list.add("Java");
		list.add(36);
		list.add("Tutorial");
		list.add(56);
		list.add(100);
		list.add("Fun learning"); 
		
		System.out.println(list);
		
		list.addFirst("Kyalo");
		System.out.println(list);
		
		list.addLast("Turqouise");
		System.out.println(list);


	}

}
