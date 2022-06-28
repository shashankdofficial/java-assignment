package q2;

import java.util.ArrayList;
import java.util.List;

public class Cities {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("mumbai");
		al.add("kanpur");
		al.add("lucknow");
		al.add("dehradoon");
		al.add("varanasi");
		al.add("banglore");
		
		al.sort((s1,s2)->s1.compareTo(s2));
		System.out.println(al);
	}
}
