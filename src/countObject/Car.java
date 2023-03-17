package countObject;

public class Car 
{
	static int count=0;
     Car()
    {
    	count++;
    	System.out.println(count + " Car created");
    }
}
