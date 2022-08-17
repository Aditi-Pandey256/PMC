import java.util.*;
public class coll4 {

		public static void main(String[] args) {
			
		ArrayList<String> food = new ArrayList<String>(); 
		
		food.add("Punjabi");
		food.add("South Indian");
		food.add("Gujrati");
		food.add("Rajasthani");
		food.add("Italian");
		food.add("Thai");
		food.add("Chinese");
		food.add("Gujrati");
		food.add("Rajasthani");
		
		System.out.println("Original arrlist: " + food);
			
		List<String> foodie = food.subList(2,4);
		
		System.out.println("sublist is :- " +foodie);
		
		System.out.println("indexOfSubList: " + Collections.indexOfSubList(food, foodie));
		      
		System.out.println("lastIndexOfSubList: " + Collections.lastIndexOfSubList(food, foodie));
		}
}
