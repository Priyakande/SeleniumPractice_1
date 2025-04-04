package SeleniumPractice_1;

public class MultiCatchExceptionDemo {

	public static void main(String[] args) 
	{
		try
		{
			int res = 100/0;
		}
		catch(ArithmeticException e)  
        {  
         System.out.println("Arithmetic Exception occurs");  
        }    
     catch(ArrayIndexOutOfBoundsException e)  
        {  
         System.out.println("ArrayIndexOutOfBounds Exception occurs");  
        }    
     catch(Exception e)  
        {  
         System.out.println("Parent Exception occurs");  
        }             
     System.out.println("rest of the code");    
		
	}

}
