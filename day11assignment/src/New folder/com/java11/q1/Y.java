package com.java11.q1;

public interface Y {
    public abstract void absForY();
	
	default void defaultForY()
	{
		System.out.println("Inside Y");
	}
	
	public static void staticForY()
	{
		
	}
}
