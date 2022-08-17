import java.text.DateFormat;
import java.util.*;

public class date3 {

	public static void main(String[] args) {
		
		Date d = new Date();
		
		Locale Russia = new Locale("ru","ch");
		
		DateFormat dateRussia = DateFormat.getDateInstance(DateFormat.FULL, Russia);
		System.out.println("Russia's Format:- " + dateRussia.format(d));
	
		
	}
}
