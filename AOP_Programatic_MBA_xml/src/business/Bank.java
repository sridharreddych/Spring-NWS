package business;

public class Bank
{

	private int amount=5000;
	private String acno="sbi123";

	public int deposit(String acno,int amount)
	{

		if(acno.equals(this.acno))
		{
			/*Log l =LogFactory.getLog(Bank.class); //changed this.class to Bank.class
			l.info(“deposit method …….”);*/
			
			System.out.println("In Deposit method");
			this.amount = this.amount+amount;
			return this.amount;
        }
		else
		{
			throw new AcnoNotFoundException();
		}
		
	}
	
	public int findBal(String ac)
	{
		
		if(ac.equals(this.acno))
			return this.amount;
		else
			throw new AcnoNotFoundException();
	}
	
}	