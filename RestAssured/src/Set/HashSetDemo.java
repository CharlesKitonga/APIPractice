package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet setl = new HashSet<>();
		
		setl.add("Kyalo");
		setl.add("kitonga");
		setl.add("Kitui");
		setl.add("Kenya");
		
		System.out.println(setl);
		
		setl.remove("Kitui");
		System.out.println(setl);		
		System.out.println("Does the hashset contain Mombasa?: " + setl.contains("Mombasa"));
		
		Iterator itr = setl.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		setl.clear(); 
		System.out.println("The HashSet is: " + setl);
		
	}

}
