package Map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lmap = new LinkedHashMap<String, Integer>();
		
		lmap.put("Kyalo", 27);
		lmap.put("Mutiso", 28);
		lmap.put("Kambua", 30);
		lmap.put("Kikio", 40);
		lmap.putIfAbsent("Kyalo3",29);
		
		System.out.println(lmap);
		System.out.println("Size of LinkedHashMap is: " + lmap.size());
		System.out.println("Check if LinkedHashMap is Empty?: " + lmap.isEmpty());		
		System.out.println("Check if LinkedHashMap Contains Key ?: " + lmap.containsKey("kambua"));		
		System.out.println("Check if LinkedHashMap Contains value ?: " + lmap.containsValue(30));		
	

	}

}
