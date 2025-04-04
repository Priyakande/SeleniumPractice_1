package SeleniumPractice_1;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<String> ();
		hs.add("Priya");
		hs.add("Pooja");
		hs.add("Avinash");
		hs.add("Navnath");
		
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
