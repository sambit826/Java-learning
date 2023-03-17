package AllPatterns;

public class TrianglePattern1 extends  PatternUserInput
{
      public void makePattern()
      {
    	  
    	  int n = takeUserInput();
    	  for(int i=1;i<=n;i++)
    	  {
    		  for(int j=1;j<=i;j++)
    		  {
    			  System.out.print("*");
    		  }
    		  System.out.println(" ");
    	  }
      }

     
 }

