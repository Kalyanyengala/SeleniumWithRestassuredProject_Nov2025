package Oops_Concepts;

class Employee          // In Single Inheritance, there should be only two classes 
{
	void getEmployee()
	{
		System.out.println("My name is kalyan" );
	}
	
	void getCompanyDetails()
	{
		System.out.println("Ahana Systems And Solutions Pvt Ltd");
	}
}

class EmployeeDetails extends Employee
{
	void getEmployeeJob()
	{
		System.out.println("Automation Test Engineer");
	}
}


public class SingleInheritance_Inheritance
{
	public static void main(String[] args) 
	{
		EmployeeDetails emp = new EmployeeDetails();
		emp.getEmployee();
		emp.getEmployeeJob();	
		emp.getCompanyDetails();
		
	}
}
