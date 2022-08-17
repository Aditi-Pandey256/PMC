import java.util.*;

public class coll2 {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub

		List <String> list = new ArrayList<String>(); 
		
		list.add("Hi, ");
		list.add("I ");
		list.add("am ");
		list.add("Aditi!!");
		
		String[] str = list.toArray(new String[0]);
		
		for (int i = 0; i<str.length; i++) {
			String data = str[i];
		
		System.out.print(data);
		
		}
		
	}

}
