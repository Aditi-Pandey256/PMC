import java.util.*;

public class date2{
	public static void main(String[] args) {
		
		// MONTH AND YEAR ARE ADDED TO DATE
		
		Calendar c1 = Calendar. getInstance();
		System.out.println("The current date is:- " + c1.getTime());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Hour:- ");
		int hour = sc.nextInt();
		c1.add (Calendar.HOUR,hour);
		System.out.println("The updated day after hour :- " + c1.getTime());
		
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the Month:- ");
		int mon = sc1.nextInt();
		c1.add (Calendar.MONTH,mon);
		System.out.println("The updated month:- " + c1.getTime());
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter the Year:- ");
		int year = sc2.nextInt();
		c1.add (Calendar.YEAR,year);
		System.out.println("The updated year :- " + c1.getTime());
		
		
		
	}
}