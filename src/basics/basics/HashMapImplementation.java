package basics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapImplementation {

	public static void main(String[] args) {

		Map<String,String> map = new HashMap<>();
		Map<String,Integer> lMap = new LinkedHashMap<String, Integer>();
		
		map.put(null, "Tejesh");
		map.put("", "Gangari");
		
		lMap.put("Age", 30);
		lMap.put("Height", 173);
	
		System.out.println(lMap.keySet());
		
	}

}
