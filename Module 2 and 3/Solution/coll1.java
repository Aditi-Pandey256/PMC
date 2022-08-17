import java.util.*;

public class coll1 {
	
	public static void main(String args[])
	{
	
		String foodArray[] = { "Chinese", "Indian", "Italian" ,"Thai"};

		System.out.println("Array input: " + Arrays.toString(foodArray));

		// CONVERTING ARRAY INTO COLLECTION
		
		List<String> foodList = Arrays.asList(foodArray);

		System.out.println("Converted elements: " + foodList);
	}
}
