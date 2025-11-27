package Oops_Concepts;

//class BankAxis
//{
//	String bankName = "Generic Bank";
//	
//	BankAxis()
//	{
//		System.out.println("Printing from BankAxis Constructor");
//	}
//	
//	void displayBankName()
//	{
//		System.out.println("Printing BankName :" + bankName);
//	}
//}
//
//class HDFCBank1 extends BankAxis
//{
//	String bankName = "HDFC Bank";
//	
//	HDFCBank1()
//	{
//		super();
//		
//		System.out.println("Printing from HDFCBank1 Constructor");
//	}
//	void displayBankName()
//	{
//		super.displayBankName();
//		System.out.println("Printing BankName from HDFCBank1 :" + bankName);
//		System.out.println("Printing Parent class bank name :" + super.bankName);
//	}
//}

// Example 2 

class RBIBankTest
{
	RBIBankTest()
	{
		System.out.println("welcome to the Bank");
	}
	
	void bankServices()
	{
		System.out.println("Provides general banking services.");
	}
}

class StateBank extends RBIBankTest
{
	StateBank()
	{
		super();
		System.out.println("Welcome to State Bank!");
	}
	
	void bankServices()
	{
		super.bankServices();
		System.out.println("Provides online and mobile banking services.");
	}
}


public class SuperCallingStatement_SuperKeyword 
{
	public static void main(String[] args)
	{
//		HDFCBank1 hd = new HDFCBank1();
//		hd.displayBankName();	
		
		StateBank st = new StateBank();
		st.bankServices();
	}


}
