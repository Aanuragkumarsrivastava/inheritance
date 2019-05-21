package inheritence;

public class employee extends person
{
	private double salary;
	private String Orgname;
	
	public employee(int id,String name,double salary,String Orgname)
	{
		super(id,name);
		this.salary= salary;
		this.Orgname= Orgname;	
	}
	public double getSalary()
	{
		return salary;
	}
	public String getOrgname()
	{
		return Orgname;
	}
}
