package inheritence;

public class person 
{
	private int id;
	private String name;
	 
	public person(int id,String name)
	{
		super();
		this.id = id;
		this.name = name;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
}
