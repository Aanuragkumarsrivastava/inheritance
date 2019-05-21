package inheritence;

public class student extends person
{
	private int marks;
	private char grade;
	public student(int id,String name,int marks,char grade)
	{
		super(id,name);
		this.marks = marks;
		this.grade = grade;
	}
	public int getMarks()
	{
		return marks;
	}
	public char getGrade()
	{
		return grade;
	}
	

}
