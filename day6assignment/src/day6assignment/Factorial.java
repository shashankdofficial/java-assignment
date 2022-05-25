package day6assignment;

public class Factorial {
	public static void main(String[] args) {
		 if(args.length>=3) {
			 System.out.println("Error");
		 }
		 else if(args.length==2)
		 {
			 int num1 = Integer.parseInt(args[0]);
			 int num2 = Integer.parseInt(args[1]);
			 int diff=Math.abs(num1-num2);
			 int fact=1;
			 for(int i=1;i<=diff;i++)
			 {
				 fact=fact*i;
			 }
			 System.out.println(fact);
		 }
		 else
		 {
			 int num1=Integer.parseInt(args[0]);
			 int fact=1;
			 for(int i=1;i<=num1;i++)
			 {
				 fact=fact*i;
			 }
			 System.out.println(fact);
		 }
	}
}
