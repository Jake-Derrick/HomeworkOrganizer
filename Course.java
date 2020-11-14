import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Course {
	ArrayList<Assignment> assignments = new ArrayList<Assignment>();


	String name;
	
	/**
	 * getName - Gets the name of the course
	 * @return - The name of the course
	 */
	public String getName() 
	{
		return name;
	}
	
	public ArrayList<Assignment> getAssignmentList()
	{
		return assignments;
	}
	
	public Assignment getAssignment(int index)
	{
		return assignments.get(index);
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void addAssignment(Assignment assignment)
	{
		assignments.add(assignment);
	}
	
	public ArrayList<Course> readFile(String fileName)
	{
		ArrayList<Course> courseList = new ArrayList<Course>();
		try
		{
			File myFile = new File(fileName);
			Scanner fileReader = new Scanner(myFile);
	
			String previousLine = "";
			while (fileReader.hasNextLine())
			{
				String data = fileReader.nextLine();

				Course course = new Course();
				//ArrayList<Assignment> assignmentList = new ArrayList<Assignment>();

				while(!data.equals("") && fileReader.hasNextLine())
				{
					//The line is a course name
					if(previousLine.equals(""))
					{
						String courseName = data.substring(0, data.indexOf(':'));
						course.setName(courseName);
					}
					//The line is an assignment
					else
					{
						String assignmentName = data.substring(0, data.indexOf('|'));
						String dueDate = data.substring(data.indexOf('|')+2, data.length()-1);
						Assignment assignment = new Assignment(assignmentName, dueDate);
						course.addAssignment(assignment);
					}
					//Update the previous line and then read a new line
					previousLine = data;
					data = fileReader.nextLine();
				}
				courseList.add(course);
				previousLine = data;
			}
			fileReader.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error: could not open file " + fileName);
		}
		return courseList;
	}
	
		@Override
	public String toString() {
		return "Course [assignments=" + assignments + ", name=" + name + "]";
	}

}
