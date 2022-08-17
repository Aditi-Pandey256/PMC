import java.util.*;

public class string1 {
	
	public static void main(String[] args) {
		
		 System.out.print("Enter the string:- ");
		 Scanner in = new Scanner(System.in);
		 String str = in.nextLine();
		 // SPLITTING THE SENTENCE TO GET THE WORDS SEPERATELY 
		 String array[]=str.split("\\s+");
		 int n = array.length;
		 String finalword = array[n-1];
		 System.out.println("The length of the finalword is:- " +finalword.length());
	}
}