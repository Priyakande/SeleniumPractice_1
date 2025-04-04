package SeleniumPractice_1;

import java.util.*;

public class ArrayListDemo {
	
	public static void main(String[] args) 
	{
		List <String> al = new ArrayList <String> ();
		al.add("Priya");
		al.add("Navnath");
		al.add("Avinash");
		al.add("Sanjay");
		al.add("Sangita");
		System.out.println("Print elements \t"+ al + "\n");
		
		System.out.println("Print elements with iterator");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("\n");
		
		System.out.println("Print elements using foreach loop");
		for(String s: al)
		{
			System.out.println(s);
		}
		
		
//		The set() method is used to replace the element at a specific index with a new element.
		al.set(0, "Pooja");
		System.out.println("\n Use of Set() method \t" + al);
		
//		The get() method is used to retrieve the element at a certain index in the ArrayList.
		System.out.println("\n Use of Get() method \t" + al.get(0));
		
//		Sort Arryalist
		Collections.sort(al);
		System.out.println("\n Sort ArryaList \t " + al);
		
	
        ArrayList<String> al2=new ArrayList<String>();  
        al2.add(0, "PRIYA");
        al2.add(1, "NAVNATH");
        System.out.println("\n After invoking add(int index, E element) method \t "+ al2);
        
        //Adding second list elements to the first list 
        al.addAll(al2);
        System.out.println("\n Adding second list elements to the first list \t" + al);
        
        al.addAll(1, al2);
        System.out.println("\n Add al2 in al from index 1 \t" + al);
        
//        al.retainAll(al2);
//        System.out.println("\n Retain only the elements that are present in both al and al2 \t " + al);

        
//        remove()
        al.remove(0);
        al.remove("PRIYA");
        System.out.println("\n After removing element at index 0 and element \"PRIYA\" \t " + al);
        
        al.removeIf(l -> l.contains("Sangita"));
        System.out.println("\n removed element with removeIf method \t" +al);
        
        al.removeAll(al2);
        System.out.println("\n removed all elements of al2 from al \t" +al);
        
        al.clear();
        System.out.println("\n removed all elements of al \t"+al);

		System.out.println("\n isEmpty method checks if arraylist is empty \t"+ al.isEmpty());
		
	}
}
