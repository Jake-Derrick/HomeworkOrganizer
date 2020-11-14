import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		ArrayList<Course> list = new ArrayList<Course>();
		Course initial = new Course();
		list = initial.readFile("HomeworkTest.txt");
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i).getName());
			for(int j = 0; j < list.get(i).getAssignmentList().size(); j++)
			{
				System.out.println(list.get(i).getAssignment(j).getName() + ", " + list.get(i).getAssignment(j).getStringDueDate());
			}
			System.out.println("");
		}
	}

}

