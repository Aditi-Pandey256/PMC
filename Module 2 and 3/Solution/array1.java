import java.util.*;
public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {2,5,6,1,2,5,8,6,4,4};
	    // FIRST SORTING THE ARRAY
		Arrays.sort(arr);
		System.out.println("The dupliacte number is:-");
		
		for(int i = 0 ; i < arr.length-1  ; i++) {
			if (arr[i] == arr[i+1]) {
				System.out.println(arr[i]);
			}
		}

	}

}

