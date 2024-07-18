package Map;

import java.util.HashMap;

public class HasMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		
		hmap.put("Kyalo", 27);
		hmap.put("Mutiso", 28);
		hmap.put("Kambua", 30);
		hmap.put("Kikio", 40);
		
		System.out.println(hmap);
		System.out.println("Kyalo is " + hmap.get("Kyalo") + " years old"); 
		
		hmap.remove("Kyalo");
		System.out.println(hmap);

		System.out.println("Size of HashMap is: " + hmap.size());
		
		hmap.clear();
		System.out.println("Check if HashMap is Empty?: " + hmap.isEmpty());		
		
		
	}

}
