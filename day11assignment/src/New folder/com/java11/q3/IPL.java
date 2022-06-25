package com.java11.q3;

import java.util.Scanner;

public class IPL {
	
	public void homeTeamStadium(Stadium stadium)
	{
		 
		 if(stadium==Stadium.CHIDAMBARAM_STADIUM)
		 {
			 System.out.println("This is the home ground of CSK");
		 }
		 else if(stadium==Stadium.M_CHINNASWAMY_STADIUM)
		 {
			 System.out.println("This is the home ground of RCB");
		 }
		 else if(stadium==Stadium.EDEN_GARDENS_STADIUM)
		 {
			 System.out.println("This is the home ground of KKR");
		 }
		 else if(stadium==Stadium.WANKHEDE_STADIUM)
		 {
			 System.out.println("This is the home ground of Mumbai Indians");
		 }
	}
	public static void main(String[] args)
	{
		IPL i1= new IPL();
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter Stadium: ");
		 String stadiumName=sc.next();
		 Stadium s=Stadium.valueOf(stadiumName);
		 i1.homeTeamStadium(s);
	}
}
