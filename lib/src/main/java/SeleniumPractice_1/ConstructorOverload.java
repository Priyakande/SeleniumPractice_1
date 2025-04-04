package SeleniumPractice_1;

class Employee
{
	int id;
	int pakage;
	String name;
	String projectName;
	String unit;
	String dateOfJoining;
	
	Employee(int id, int pakage, String name)
	{
		this.id = id;
		this.pakage = pakage;
		this.name = name;
	}
	
	Employee(String projectName)
	{	
		this.projectName = projectName;
	}
	Employee(String unit, String dateOfJoining)
	{
		this.unit = unit;
		this.dateOfJoining = dateOfJoining;
	}
	
	 void Display()
	{
		System.out.println(id +" "+ pakage +" "+ name +" "+ projectName +" "+ unit +" "+ dateOfJoining);
	}
}

public class ConstructorOverload {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1,1500000,"priya");
		Employee e2 = new Employee("BFSI");
		Employee e3 = new Employee("Banking", "21-04-1997");
		
	e1.Display(); e2.Display(); e3.Display();

	}

}
