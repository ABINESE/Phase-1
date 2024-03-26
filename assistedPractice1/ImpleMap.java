package assistedPractice1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class ImpleMap {

	public static void main(String[] args) {
		HashMap<Integer, String> has=new HashMap<>();
		has.put(1, "one");
		has.put(2, "Two");
		has.put(3,"Three");
		has.put(4,"Four");
		for(Integer key:has.keySet())
		{
			 System.out.print("Key: " + key + ", Value: " + has.get(key));
		}
		
			 System.out.println();
		
		LinkedHashMap<String, String> lmap=new LinkedHashMap<>();
		lmap.put("one", "one");
		lmap.put("four", "Two");
		lmap.put("nine","Three");
		lmap.put("four","Four");
		
		for(String key:lmap.keySet())
		{
			 System.out.print("Key: " + key + ", Value: " + lmap.get(key));
		}
		TreeMap<String, Integer> tMap = new TreeMap<>();
		tMap.put("one square", 1);
		tMap.put("Two Square", 4);
		tMap.put("Three Square", 9);
		tMap.put("Four Square", 16);
		System.out.println();
		for(String key:tMap.keySet())
		{
			 System.out.print("Key: " + key + ", Value: " + tMap.get(key));
		}
	}

}
