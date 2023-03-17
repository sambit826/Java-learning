package Poly;

public class CheckingAccount extends BankAccount
{
    final double rate=0.06;
    private int principal=6000;
    private int time=14;
    
    
    
    public CheckingAccount(int principal,int time)
    {
    	this.principal=principal;
    	this.time=time;
    }
    public void m2()
    {
    	System.out.println("CHECKING ACCOUNT INTREST :"+rate*principal*time+"%");
    }
}
