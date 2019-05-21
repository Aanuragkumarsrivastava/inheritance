package inheritence;

public class client {

	public static void main(String[] args) 
	{
		student obj = new student(1,"john",500,'A');
		System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getMarks()+" "+obj.getGrade());

	}

}
