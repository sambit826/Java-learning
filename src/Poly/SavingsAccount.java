package Poly;

public class SavingsAccount extends BankAccount
{
  final double rate=0.02;
  private int principal=5000;
  private int time=10;
   
  public SavingsAccount(int principal,int time)
  {
	  this.principal=principal;
	  this.time=time;
  }
  public void m2()
  {
	  System.out.println("SAVINGS ACCOUNT INTREST :"+rate*principal*time+"%");
  }
  
}
