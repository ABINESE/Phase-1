package assistedPractice1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
public class CollectionImple {
public static void main(String[] args) {
	ArrayList<String> arr=new ArrayList();
	arr.add("one");
	arr.add("Two");
	arr.add("Three");
	System.out.println("ArrayList"+arr);
	HashSet<String> has=new HashSet();
	has.add("one");
	has.add("two");
	has.add("Three");
	has.add("one");// Duplicate will be removed
	System.out.println("HashhSet"+has);
	
	HashMap<Integer, String> map=new HashMap();
	map.put(1,"one");
	map.put(2, "two");
	map.put(3, "Three");
	System.out.print("HashMap"+map);
}
}
