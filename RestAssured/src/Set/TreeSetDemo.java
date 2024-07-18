package Set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet tset = new TreeSet<>();
		
		tset.add(23);
		tset.add(35);
		tset.add(89);
		tset.add(900);
		tset.add(100);
		
		System.out.println(tset);
		
		tset.remove(100);
		System.out.println(tset);
		
		System.out.println("Does it have 89?: " + tset.contains(89));
		System.out.println("First Element of TreeSet is: " + tset.first());
		System.out.println("Last Element of TreeSet is: " + tset.last());
		System.out.println("HeadSet Element of TreeSet is: " + tset.headSet(900));
		System.out.println("TailSet Element of TreeSet is: " + tset.tailSet(35));
		
		System.out.println("SubSet Element of TreeSet is: " + tset.subSet(23, 100));

		tset.clear();
		System.out.println(tset);
	}

}
