package Oops_Concepts;

class Bank
{
	double getRateOfInterest()
	{
		return 0.0;
	}
	
	String getBankCode()
	{
		return "code 9857";
	}
}
class HDFC extends Bank
{
	double getRateOfInterest()
	{
		return 7.0;
	}
	String getBankCode()
	{
		return "code 9596";
	}

}
class AxisBank extends Bank
{
	double getRateOfInterest()
	{
		return 8.0;
	}
	String getBankCode()
	{
		return "code 9000";
	}
}

public class OverRiding_Polymorphism 
{
	public static Bank bank;
	
	public static void main(String[] args)
	{
		Bank ba = new Bank();
		System.out.println("Bank rate of interest is :" + ba.getRateOfInterest() + "%");
		System.out.println("Bank code is :" + ba.getBankCode());
		
		HDFC hdfc = new HDFC();
		System.out.println("HDFC Bank rate of interset is :" + hdfc.getRateOfInterest() + "%");
		System.out.println("Bank code is :" + hdfc.getBankCode());
		
		AxisBank axis = new AxisBank();
		System.out.println("AxisBank rate of interest is :" + axis.getRateOfInterest() + "%");
		System.out.println("Bank code is :" + axis.getBankCode());
		
		bank = new Bank();
		System.out.println("Bank rate of interest is :" + bank.getRateOfInterest() + "%");
		System.out.println("Bank code is :" + bank.getBankCode());
		
		bank = new HDFC();
		System.out.println("HDFC rate of interest is :" + bank.getRateOfInterest() + "%");
		System.out.println("Bank code is :" + bank.getBankCode());
		
		bank = new AxisBank();
		System.out.println("AxisBank rate of interest is :" + bank.getRateOfInterest() + "%");
		System.out.println("Bank code is :" + bank.getBankCode());		
		
	}

}

