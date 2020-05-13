public class Classroom
{
	public static void main(final String[] args) {
		final Wilder[] student = new Wilder[3];
		student[0] = new Wilder("Damien", false);
		student[1] = new Wilder("Nina", true);
		student[2] = new Wilder("Gaston", false);

		for (int i = 0; i < student.length; i++) {
			final String Text = student[i].whoAmI();
			System.out.println("  " + " " +(i+1)+". " +Text);
		}
	}
}
