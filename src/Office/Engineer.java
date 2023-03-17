package Office;

public class Engineer extends Employee
{
     final int days=30;
     private int sal=600;
     
     public Engineer(int sal)
     {
    	 this.sal=sal;
     }
     public void calculateSalary()
     {
    	 System.out.println("ENGINEER SALARY IS :"+days*sal);
     }
}
