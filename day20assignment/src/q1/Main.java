package q1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Student> al = new ArrayList<>();
		al.add(new Student(10,"Shashank",840));
		al.add(new Student(12,"Rohit",740));
		al.add(new Student(14,"Neha",640));
		al.add(new Student(18,"Dolly",940));
		al.add(new Student(19,"Gautam",240));
		al.add(new Student(3,"Devarishi",589));
		
		List <Student> std=al.stream().filter(s->s.getMarks()<800).collect(Collectors.toList());
		System.out.println(std);
	}
}
