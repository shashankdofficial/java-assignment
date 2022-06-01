package question1;
import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount) {
		if(amount>=1000)
		{
			TajHotel t1 = new TajHotel();
			return t1;
		}
		else 
		{
			RoadSideHotel roadHotel = new RoadSideHotel();
			return roadHotel;
		}
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Amount");
		int amount = scan.nextInt();
		if(amount<=200) {
			System.out.println("Enter valid Amount");
		}
		else
		{
		    Demo d1 = new Demo();
		    Object o1=d1.provideFood(amount);
		    if(o1 instanceof TajHotel) {
		    	TajHotel taj = new TajHotel();
		    	taj.welcomeDrink();
		    }
		    else if(o1 instanceof RoadSideHotel) {
		    	RoadSideHotel road = new RoadSideHotel();
		    	road.masalaDosa();
		    }
		}
		scan.close();
    }
}
