package Oops_Concepts;

//---> Parent and child we can call methods and siblings methods we can not call by siblings 
// ----> One parent can have multiple childs 

class BankRBI            
{
	void showBankName()
	{
		System.out.println("Bank Name Is : HDFC");
	}
}

class SavingsAccount extends BankRBI
{
	void showSavingsAccount()
	{
		System.out.println("Savings Account Interest : 7.0% ");
	}
}

class CurrentAccount extends BankRBI
{
	void showCurrentAccount()
	{
		System.out.println("Current Account Interest : 9.0% ");
	}
}

public class HierarchyInheritance_Inheritance 
{

	public static void main(String[] args)
	{
		CurrentAccount ca = new CurrentAccount();
		
		ca.showBankName();
		ca.showCurrentAccount();
		
		SavingsAccount sa = new SavingsAccount();
		
		sa.showBankName();
		sa.showSavingsAccount();
		
	}
}
