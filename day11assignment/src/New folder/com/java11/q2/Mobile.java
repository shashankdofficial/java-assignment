package com.java11.q2;

public class Mobile {
	
	String[] outdatedModels = {"note4","note5","note6","note7"}; 
	public void searchOutdatedModel(String mobileCompany, String... modelNum)
	{
		for(String x:modelNum)
		{
			for(String y:outdatedModels)
			{
				if(x==y)
				{
					System.out.println(x+"_OUTDATED");
				}
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.searchOutdatedModel("Samsung", "note5");
	}
}
