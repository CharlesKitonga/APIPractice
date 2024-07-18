package ListInterface;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList<>();
		
		list.add(30);
		list.add(35);
		list.add("Kyalo");
		list.add(30);
		list.add(78);
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		System.out.println(list.get(2));
	}

}
