package Java8_Practice;

import java.util.function.Consumer;

import com.google.common.base.Function;

class Student1 {
	String name;
	int marks;

	Student1(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

//Test
public class ConsumerDemo {

	public static void main(String[] args) {
		Student1 [] s = { new Student1 ("Priya", 100), new Student1  ("Pooja", 65), new Student1 ("Sunny", 55),
				new Student1 ("Bunny", 45), new Student1 ("Chinni", 25) };
		
		Function<Student1, String> f = s1 -> {
			String grade = " ";
			if (s1.marks > 80)
				grade = "A++";
			else if (s1.marks > 65)
				grade = "A";
			else if (s1.marks > 50)
				grade = "Pass";
			else
				grade = "Fail";

			return grade;
		};
		
		Consumer <Student1> c = s3->
		{
			System.out.println(s3.name);
			System.out.println(s3.marks);
			System.out.println(f.apply(s3) + "\n");
		};

		for (Student1 s4 : s) {
			c.accept(s4);
		}
	}
}
