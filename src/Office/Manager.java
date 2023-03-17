package Office;

public class Manager extends Employee 
{
     final int days=30;
     private int sal=800;
     
     public Manager(int sal)
     {
    	 
    	 this.sal=sal;
    	 
     }
     public void m4()
     {
    	 System.out.println("CREDITED");
     }
     public void calculateSalary()
     {
    	 System.out.println("MANAGER SALARY :"+days*sal);
     }
}
