package Oops_Concepts;

// -----> This is MultiLevel Inheritance one class should become parent to another and another become parent to another 
// ----> class EmployeeCompany extends EmployeeName Allowed && class EmployeeCompany extends EmployeeName, AnotherClass Not allowed

class EmployeeName    
{
	void getEmployeeName()
	{
		System.out.println("Employee Name : Kalyan");
	}
}

class EmployeeCompany extends EmployeeName
{
	void getEmployeeCompany()
	{
		System.out.println("Employee Company : Ahana Systems And Solutions PvtLtd " );
	}
}
class EmployeeJob extends EmployeeCompany
{
	void getEmployeeJobRole()
	{
		System.out.println("Employee Job Role : Automation Test Engineer");
	}
}

public class MultiLevelInheritance_Inheritance 
{

	public static void main(String[] args) 
	{
		EmployeeJob emp = new EmployeeJob();
		emp.getEmployeeName();
		emp.getEmployeeCompany();
		emp.getEmployeeJobRole();
		
	}
}
