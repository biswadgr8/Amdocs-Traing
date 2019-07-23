package MyPackage;
import java.io.*;
import java.util.*;
public class FileRead {

	public static void main(String args[])
	{
		try {
			BufferedReader in = new BufferedReader(new FileReader("outfile"));
			String str;
			
			while ((str =in.readLine())!=null)
			{
				System.out.println(str);
			}
			in.close();
			Scanner scanner = new Scanner(new File("outfile"));
			while (scanner.hasNextLine())
			{
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		}catch(IOException e)
		{
			
		}
	}
}
