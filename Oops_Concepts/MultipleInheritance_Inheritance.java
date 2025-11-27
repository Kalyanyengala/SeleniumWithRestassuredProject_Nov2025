package Oops_Concepts;

// ----> One child can hold multiple parents but it is not possible by class in java possible with interfaces 
// ----> (child c extends a , b --->it is not possible) and (child c implements a , b ---> it is possible)

interface Account
{
	void openAccount();
}
interface Loan
{
	void applyLoan();
}
interface updateNumber
{
	void updateNumber();
}

class HDFCBank implements Account , Loan , updateNumber
{
	public void openAccount()
	{
		System.out.println("Account opened successfully");
	}
	
	public void applyLoan()
	{
		System.out.println("Loan applied successfully");
	}
	
	public void updateNumber()
	{
		System.out.println("Updated MobileNumber....");
	}
}
public class MultipleInheritance_Inheritance 
{
	public static void main(String[] args) 
	{
		HDFCBank hd = new HDFCBank();
		hd.openAccount();
		hd.applyLoan();
		hd.updateNumber();
		
	}
	
}
