package Oops_Concepts;

public class EncapsulationPractise_Oops 
{
	private String name;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public static void main(String [] args)
	{
		EncapsulationPractise_Oops nam = new EncapsulationPractise_Oops();
		nam.setName("Kalyan");
		System.out.println(nam.getName());
	}

}