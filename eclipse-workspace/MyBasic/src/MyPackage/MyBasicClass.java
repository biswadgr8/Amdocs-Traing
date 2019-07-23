package MyPackage;

public class MyBasicClass 
{
	public void justprint()
	{
		
		System.out.println("Basic Method");
//		System.out.println("Long max Value " + Long.MAX_VALUE);
//		System.out.println("Long min Value " + Long.MIN_VALUE);
//		
//		System.out.println("Integer max Value " + Integer.MAX_VALUE);
//		System.out.println("Integer min Value " + Integer.MIN_VALUE);
//		
//		System.out.println("Short max Value " + Short.MAX_VALUE);
//		System.out.println("Short min Value " + Short.MIN_VALUE);
//		
//		System.out.println("Float max Value " + Float.MAX_VALUE);
//		System.out.println("Float min Value " + Float.MIN_VALUE);
//		
//		System.out.println("Character max Value " + Character.MAX_VALUE);
//		System.out.println("Character min Value " + Character.MIN_VALUE);
		
	}
}

class NewClass extends MyBasicClass
{
	public void justprint()
	{
		super.justprint();
		System.out.println("Basic Method extended");
	}
}