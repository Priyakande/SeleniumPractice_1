package Java8_Practice;

import com.google.common.base.Function;

class Student {
	String name;
	int marks;
	Student(String name, int marks)
	{
		this.name = name;
		this.marks = marks;
	}
}

public class FunctionDemo {

	public static void main(String[] args) {
				Student [] s = {
						new Student ("Priya",100),
						new Student ("Pooja", 65),
						new Student ("Sunny", 55),
						new Student ("Bunny", 45),
						new Student ("Chinni", 25)						
				};
				Function<Student,String> f = s1-> {
					String grade = " ";
					if(s1.marks>80)
						grade = "A++";
					else if(s1.marks>65)
					grade = "A";
					else if(s1.marks>50)
						grade = "Pass";
					else
						grade = "Fail";
					
					return grade;
				};
				
				for (Student s3:s)
				{
					System.out.println(s3.name);
					System.out.println(s3.marks);
					System.out.println(f.apply(s3) + "\n");
				}
		}
	}


