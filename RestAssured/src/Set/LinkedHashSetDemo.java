package Set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Object> set = new LinkedHashSet<>();
		
		set.add("Kyalo");
		set.add(27);
		set.add("Java Course");
		set.add("Kenya");
		
		System.out.println(set);
	}

}
