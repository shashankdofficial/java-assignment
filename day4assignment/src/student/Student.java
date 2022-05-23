package student;

public class Student {

	void StudentDetail(int roll,int age,int marks,String name) {
		  if(age<18 || age>60)
		  {
			 System.out.println("Enter valid Age"); 
		  }
		  if(marks<0 || marks>500)
		  {
			  System.out.println("Enter valid MArks");
		  }
		  
		  System.out.println("The Roll is:" + roll +"\n"+"The age is:" + age +
				  "\n"+"The Marks are:" +  marks +"\n"+ "The name is:"+ name);
	  }

}
