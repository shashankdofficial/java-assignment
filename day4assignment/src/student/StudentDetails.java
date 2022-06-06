package student;

public class StudentDetails {

	Student s1 = new Student();
	   
	   StudentDetails(){
		   
	   }
	   StudentDetails(int roll,int age,int marks,String name){
		   s1.StudentDetail(roll,age,marks,name);
	   }
	   
	   public static void main(String[] args) {
		
		   StudentDetails student1 = new StudentDetails();
		   student1.s1.StudentDetail(1, 24, 600, "Shashank");
		   
		   StudentDetails student2 = new StudentDetails(2, 25, 450, "Gutam");
		   
		   
	   }
}
