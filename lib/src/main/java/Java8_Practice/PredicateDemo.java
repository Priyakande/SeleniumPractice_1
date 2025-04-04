package Java8_Practice;

import java.util.ArrayList;

import com.google.common.base.Predicate;

class Employee{
	String name;
	double salary;
	Employee(String n, double s)
	{
		this.name = n;
		this.salary = s;
	}
}

public class PredicateDemo {

	public static void main(String[] args) {
		ArrayList<Employee> Al_employee = new ArrayList<Employee>();
		Al_employee.add(new Employee("Priya",1000));
		Al_employee.add(new Employee("Nano",2000));
		Al_employee.add(new Employee("Avi",5000));
		Al_employee.add(new Employee("Sanjay",10000));
		Al_employee.add(new Employee("Mahesh",4000));
		Al_employee.add(new Employee("Ravi",6000));
		Al_employee.add(new Employee("Pooja",9000));
		Al_employee.add(new Employee("Gargi",7000));
		
		// Get employees whose salary is greater than 3000
		Predicate <Employee> p = e-> e.salary>3000;
		
		for(Employee e1: Al_employee) {
			if(p.test(e1)) {
				System.out.println(e1.name +" "+ e1.salary);
			}
		}

		
	}

}
