package SeleniumPractice_1;

class Student
{
	int rollNumber;
	String name;
	static String college = "DIEMS";
	
	Student(int rno, String name)
	{
		this.rollNumber = rno;
		this.name = name;
		this.college = "PES";
		
	}
	void Display()
	{
		System.out.println(rollNumber +" "+ name +" "+ college);
	}
	
	static String ChangeCollege()
	{
		return college = "CSMSS";
	}
}

public class StaticDemo {

	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "priya");
		Student s2 = new Student(2, "sanjay");
		Student s3 = new Student(3, "kande");

		s1.Display();
		s2.Display();
//		s3.ChangeCollege();
		Student.ChangeCollege();

		s3.Display();
		

	}

}
