package SeleniumPractice_1;

class A {
	void method1()
	{
		System.out.println("This is first method of parent class");
	}
	void method2()
	{
		System.out.println("This is overriden of parent class");	
	}
}
 class B extends A
 {
	 void method2()
	 {
			System.out.println("This is overriding method");
	 }
	 
	 public static void main(String [] args)
	 {
		 A a = new A();
		 a.method1();
		 a.method2();
		 
		 B b = new B();
		 b.method1();
		 b.method2();
		 
		 A ob = new B(); // This is method overriding
		 ob.method2();
		 
		 
	 }
 }
