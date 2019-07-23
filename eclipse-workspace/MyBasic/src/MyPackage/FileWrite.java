package MyPackage;

import java.io.*;
import java.util.Scanner;
public class FileWrite {

	public static void main(String args[])
	{
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("InputFile"));
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			for(int i=0;i<n;i++)
			{
			out.write(in.nextLine());
			}
			out.close();
			System.out.println("File Created Sucessfully");
			in.close();
		}
		catch(IOException e) {
			
		}
	}
}
