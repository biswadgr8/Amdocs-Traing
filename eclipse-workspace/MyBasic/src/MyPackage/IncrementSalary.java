package MyPackage;
import java.io.*;
//import java.util.*;
public class IncrementSalary {

	public static void main(String args[])
	{
		try {
			BufferedReader in = new BufferedReader(new FileReader("InputFile"));
			String employeeRecord;
			String empGrade,empSalary,empyos,empId,updatedEmpId;
			int y;
			double percentage,increment,salary;
			while ((employeeRecord =in.readLine())!=null)
			{
				empId =employeeRecord.substring(0,10);
				empGrade = employeeRecord.substring(10,12);
				empSalary = employeeRecord.substring(12,18);
				salary=Double.parseDouble(empSalary);
				empyos =employeeRecord.substring(18,20);
				y=Integer.parseInt(empyos);
					
				if(empGrade=="G1")
				{
					if(y>=15)
						percentage=6;
					else if(y>9 && y<15)
						percentage=5.5;
					else percentage=5;
					increment = (percentage*salary)/100;
					salary+=increment;
				}
					
				else if(empGrade=="G2")
				{
					if(y>15)
						percentage=8;
					else if(y>9 && y<15)
						percentage=7.5;
					else percentage=7;
					increment = (percentage*salary)/100;
					salary+=increment;
				}
				else
				{
					if(y>15)
						percentage=4;
					else if(y>9 && y<15)
						percentage=3.5;
					else percentage=3;
						increment = (percentage*salary)/100;
						salary+=increment;
				}
					//sal1 = (int) Math.round(sal);
				empSalary=Double.toString(salary);
				updatedEmpId=empId+empSalary;
					
				System.out.println(updatedEmpId);
				BufferedWriter out = new BufferedWriter(new FileWriter("OutputFile",true));
				out.write(updatedEmpId);
				out.write("\n");
				out.close();
				}
				in.close();
			}catch(IOException e)
			{
				
			}
		}
}
