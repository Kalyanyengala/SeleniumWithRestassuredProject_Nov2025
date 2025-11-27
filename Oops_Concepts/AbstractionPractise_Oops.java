package Oops_Concepts;

abstract class BankLoans
{
	abstract void HDFCBankLoan();
	
	void BankLoans()
	{
		System.out.println("Axis Bank Loan Rate Is : 7.0 % ");
	}
	
}

class AxisBankLoan extends BankLoans
{
	void HDFCBankLoan()
	{
		System.out.println("HDFCBank Loan Is : 8 % ");
	}
	
}

public class AbstractionPractise_Oops
{
	public static void main(String[] args)
	{
		AxisBankLoan ax = new AxisBankLoan();
		ax.BankLoans();
		ax.HDFCBankLoan();
		
	}
}



