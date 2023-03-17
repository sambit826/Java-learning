package Office;

public class Run 
{
     public static void main(String[]args)
     {
    	 Employee e=new Manager(4);
    	 e.m1(6);
    	 e.m1(4.5);
    	 e.m2();
    	 Manager m=new Manager(5);
    	 m.m4();
    	 e.calculateSalary();
    	 e=new Engineer(6);
    	 e.calculateSalary();
    	 e=new Clerk(3);
    	 e.calculateSalary();
    	 
     }
}
