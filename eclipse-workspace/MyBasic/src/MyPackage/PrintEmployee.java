package MyPackage;

public class PrintEmployee {
public static void main(String args[])
{
	Employee e1 = new Employee("Biswa");
	e1.empAge();
	e1.empDesignation();
	e1.empSalary();
	e1.print();
	
	Employee e2 = new Employee("Mendhak");
	e2.empAge();
	e2.empDesignation();
	e2.empSalary();
	e2.print();

	Employee e3 = new Employee("Biswa",24,"Software Developer",60000);
	e3.print();
	
	Employee e4 = new Employee("Mendhak",23,"Software Developer",60000);
	e4.print();
}
}
