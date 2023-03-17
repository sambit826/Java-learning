package door;

public class Circle extends Shape
{
      final double pi=3.14;
      private int radius=15;
      
      public Circle(int radius)
      {
    	  this.radius=radius;
      }
      
      public void area()
      {
    	  System.out.println("The area of circle:"+pi*radius*radius);
      }
}
