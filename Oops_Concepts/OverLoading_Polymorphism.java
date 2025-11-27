package Oops_Concepts;

public class OverLoading_Polymorphism 
{
	void addCaustomer(String name)
	{
		System.out.println("Caustomer added with name :" + name);
	}
	
	void addCaustomer(String name , long mobileNumber)
	{
		System.out.println("Caustomer added with :" + name + "and mobilenumber :" + mobileNumber );
	}
	
	void addCaustomer(String name , long mobileNumber, String accountType)
	{
		System.out.println("Caustomer added with :" + name + "and mobilenumber :" + mobileNumber+ " accountType is :" + accountType );
	}
	
	public static void main(String[] args) 
	{
		OverLoading_Polymorphism poly = new OverLoading_Polymorphism();
		poly.addCaustomer("kalyan");
		poly.addCaustomer("naveen", 7337279857l);
		poly.addCaustomer("pavan", 9857673893l, "savings");
	}

}
