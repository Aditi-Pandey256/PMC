import java.util.*;
import java.io.*;
public class coll5 {
	
	// USING THE DISTANCE WE WILL ROTATE THE LIST
	
	public static void main (String[] args) {
	
		List<Integer> num = new ArrayList <Integer>();
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(60);
		num.add(70);
		num.add(80);
		num.add(90);
		num.add(100);
		
		
		System.out.println("The original ArrayList:-" + Arrays.toString(num.toArray()));

		//Number of rotations
		for (int i = 0; i < 4; i++) {
		//Stores the value of last element
            int temp = num.get(9);
          
            for (int j = 9; j > 0 ; j--) {
                num.set(j, num.get(j - 1));
            }
            num.set(0, temp);
        }
		System.out.println("The rotated List:- " + Arrays.toString(num.toArray()));
	
		
		
	}
}
