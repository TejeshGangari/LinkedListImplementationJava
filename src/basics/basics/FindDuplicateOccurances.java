package basics;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateOccurances {

	public static void main(String args[]) {
		
		String text = "I am am learning java java a a a z z e d r w e q a t d x z e";
		findDuplicateOccurances(text);
		
	}
	
	static void findDuplicateOccurances(String text) {
		String[] s = text.split(" ");
		Map<String,Integer> result = new HashMap<>();
		for(String i:s) {
			if(!result.containsKey(i)) {
				result.put(i, 1);
			}else {
				result.put(i, result.get(i)+1);
			}
		}
		
		for(String it:result.keySet()) {
			if(result.get(it)>1) {
				System.out.println(it+" "+result.get(it));
			}
		}
	}
}
