package Poly;

public class CreditCardAccount extends BankAccount
{
     final double rate=0.07;
     private int principal=6000;
     private int time=13;
     
     public CreditCardAccount(int principal,int time)
     {
    	 this.principal=principal;
    	 this.time=time;
     }
     public void m2()
     {
    	 System.out.println("CREDIT CARD ACCOUNT INTREST :"+rate*principal*time+"%");
     }
}
