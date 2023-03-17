package door;

public class Rectangle extends Shape 
{
    private int width;
    private int length;
    
    public Rectangle(int width,int length)
    {
    	this.width=width;
    	this.length=length;
    }
    public void area()
    {
    	 int area=width*length;
    	System.out.println("The area of rectangle:"+area);
    }
}
