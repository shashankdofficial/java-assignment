package q3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List <Student> al = new ArrayList<>();
		al.add(new Student(10,"Shashank",840));
		al.add(new Student(12,"Rohit",740));
		al.add(new Student(14,"Gautam",640));
		al.add(new Student(18,"Devrishi",940));
		al.add(new Student(19,"Neha",240));
		al.add(new Student(3,"Yashi",589));
		Employee em = new Employee();
		
		List<Integer> std=al.stream().map(s ->(s.getMarks()*1000)).collect(Collectors.toList());
		std.forEach(e -> {
		    em.setSalary(e);
		});
		
		int i=0;
		for(Student a:al)
	    {
	    	em.setEmpId(a.getRollNo());
	    	em.setEmpName(a.getStudentName());
	    	em.setSalary(std.get(i));
	    	i++;
	    	System.out.println(em);
	    }
	
		
}
}
