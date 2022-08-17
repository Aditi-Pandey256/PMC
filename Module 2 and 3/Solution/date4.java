import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before Formatting:- " +LocalDateTime.now());
		
		
		DateTimeFormatter myObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String date1 = myDateObj.format(myObj);
	    System.out.println("After formatting: " + date1);
		
		DateTimeFormatter myObj1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String date2 = myDateObj.format(myObj1);
		System.out.println("After formatting:- " + date2);
		
		DateTimeFormatter myObj2 = DateTimeFormatter.ofPattern("E,MMM-dd-yyyy");
		String date3 = myDateObj.format(myObj2);
		System.out.println("After formatting:- " + date3);
		
		DateTimeFormatter myObj3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date4 = myDateObj.format(myObj3);
		System.out.println("After formatting:- " + date4);
		
		

	}

}
