package MyPackage;

import java.util.*;
public class ArrayDemo {
	
	public static void main(String args[])
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		ArrayList arraylist = new ArrayList();
		for(int i=1;i<=num;i++)
		{
			Scanner in = new Scanner(System.in);
			arraylist.add(in.nextInt());
		}
		Collections.sort(arraylist);
		System.out.println(arraylist);
		}
}
