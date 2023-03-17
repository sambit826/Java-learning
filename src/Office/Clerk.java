package Office;

public class Clerk extends Employee
{
       final int days=30;
       private int sal=300;
       
       public Clerk(int sal)
       {
    	   this.sal=sal;
       }
       public void calculateSalary()
       {
    	   System.out.println("CLERK SALARY IS :"+sal*days);
       }
       
}
