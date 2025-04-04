package SeleniumPractice_1;

interface AA {
	default void add() {
		int a = 2, b = 3, c;
		c = a + b;
		System.out.println(c);
	}
}

interface BB {
	default void add() {
		int a = 3, b = 3, c;
		c = a + b;
		System.out.println(c);
	}
}

public class PyramidProbmlemWithInterface implements AA, BB {
	void sub() {
		int p = 2, q = 3, r;
		r = q - p;
		System.out.println(r);
	}
	
	@Override
	public void add() {
		// TODO Auto-generated method stub
		BB.super.add();
	}

	/*
	 * @Override public void add() { // TODO Auto-generated method stub
	 * AA.super.add(); }
	 */
	public static void main(String[] args) {
		PyramidProbmlemWithInterface cObject = new PyramidProbmlemWithInterface();
		cObject.add();
		
	}

}


