import java.util.*;
public class coll3{
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> food = new HashMap <Integer,String>();
		
		food.put(1,"Indian");
		food.put(2,"Chinese");
		food.put(3,"Thai");
		food.put(4,"Italian");
		
		System.out.println("The hashset is:- " + food.entrySet());
		
	}
}