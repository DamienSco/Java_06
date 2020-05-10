public class Classroom
{
	public static void main(String[] args)
	{
		Wilder[] student = new Wilder[10];
		student[0] = new Wilder("Damien", false);
		student[1] = new Wilder("Nina", true);
		student[2] = new Wilder("Gaston", false);
	
		for (int i = 0; i < student.length; i++)
		{
			String Text=student[i].whoAmI();
			System.out.println("  " + " " +(i+1)+". " +Text);
		}
	}
}