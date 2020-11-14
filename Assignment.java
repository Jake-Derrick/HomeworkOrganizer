
/**
 * An individual assignment object that contains the assignments name, dueDate, and intDate (used for sorting assignments by due date).
 * 
 * @author Jake Derrick
 * 
 */
public class Assignment {
	private String name;
	private String dueDate;
	private int intDate;
	
	/** A constructor for Assignment
	 * 
	 * @param name - The name of the assignment
	 * @param dueDate - The date of an assignment represented as "mm/dd"
	 */
	public Assignment(String name, String dueDate)
	{
		this.name = name;
		this.dueDate = dueDate;
		convertDueDate();
	}
	/**
	 * getName - Gets the name of the assignment
	 * @return - The name of the assignment
	 */
	public String getName() 
	{
		return name;
	}
	
	/**
	 * getStringDueDate - Gets the due date of the assignment in string form
	 * @return - The due date of the assignment in string form
	 */
	public String getStringDueDate()
	{
		return dueDate;
	}
	
	/**
	 * getIntDueDate - Gets the integer due date of the assignment
	 * @return - The due date of the assignment in integer form
	 */
	public int getIntDueDate()
	{
		return intDate;
	}
	
	/**
	 * setName - Sets the name of the Assignment object
	 * @param name - The name of the assignment
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * setDueDate - Sets the string due date of the Assignment object
	 * @param dueDate - The string due date in the form "mm/dd"
	 */
	public void setDueDate(String dueDate)
	{
		this.dueDate = dueDate;
	}
	
	/**
	 * convertDueDate - Removes the / from the string due date and then casts it to an integer value.
	 * Sets the value of intDate
	 */
	private void convertDueDate()
	{
		String sDate = dueDate;
		int iDate = 0;
		//Remove the slash from the date
		sDate = sDate.replace('/', '\0');
		
		//Cast the string to an int
		try
		{
			iDate = Integer.parseInt(sDate);
		}
		catch (NumberFormatException e)
		{
			iDate = -1;
		}
		
		intDate = iDate;
	}

}
