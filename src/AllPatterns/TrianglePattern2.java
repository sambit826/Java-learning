package AllPatterns;

public class TrianglePattern2 extends PatternUserInput 
{
      public void makePattern()
      {
    	  int n = takeUserInput();
    	  for(int i=0;i<n;i++)
    	  {
    		  for(int j=0;j<n;j++)
    		  {
    			  if(i>=j)
    				  System.out.print("*");
    			  else
    				  System.out.print(" ");
    		  }
    		  System.out.println(" ");
    	  }
    	  
      }
     
}
