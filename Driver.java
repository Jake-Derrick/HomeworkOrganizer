
public class Driver {

	public static void main(String[] args) {
		String sDate = "10/10";
		int iDate = 0;
		//Remove the slash from the date
		sDate = sDate.replaceAll("/", "");
		System.out.println(sDate);

		//Cast the string to an int
		try
		{
			iDate = Integer.parseInt(sDate);
		}
		catch (NumberFormatException e)
		{
			iDate = -1;
		}
		
		System.out.println(iDate);

	}

}
