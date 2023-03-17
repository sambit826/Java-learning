package Poly;

public class Run 
{
     public static void main(String[]args)
     {
    	 BankAccount a=new CheckingAccount(20,30);
    	 a.m1(5);
    	 a.m1(10.5);
    	 a.m2();
    	 a=new CreditCardAccount(10,45);
    	 a.m2();
    	 a=new SavingsAccount(43,53);
    	 a.m2();
     }
}
