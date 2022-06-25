package com.java11.q1;

public interface X {
	
	public abstract void absForX();
	
	default void defaultForX()
	{
		System.out.println("Inside X");
	}
	
	public static void staticForX()
	{
		
	}
}
