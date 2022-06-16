package question1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

public static void main(String[] args) {
		
		Map<String,Student> hm = new HashMap<>();
		
		hm.put("Uttar Pradesh", new Student(1, "Shashank", 780));
		hm.put("Delhi", new Student(2, "Aditya", 580));
		hm.put("Kolkata", new Student(3, "Gautam", 680));
		hm.put("Kerela", new Student(4, "Devrishi", 480));
		hm.put("Gujrat", new Student(5, "Manoj", 380));

		Set<Map.Entry<String,Student>> set = hm.entrySet();
		
		Set<Map.Entry<String,Student>> treeSet = new TreeSet<>(new SortByMarks());
		
		for(Map.Entry<String,Student> me: set) {
			treeSet.add(me);
		}
		
		for(Map.Entry<String,Student> result: treeSet) {
			System.out.println(result.getKey()+" ----> "+result.getValue());
		}
	}
}
