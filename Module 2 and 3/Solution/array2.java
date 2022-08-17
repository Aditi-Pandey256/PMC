
public class array2 {

	public static int[] sort(int[] arr) {
		
		int zeroCount =0 ;
		int oneCount =0;
		
		for(int i =0 ; i< arr.length;i++) {
		// IF ZERO IS ENCOUNTERED THEN INCREMENT THE ZERO COUNTER
			if(arr[i] == 0)
				zeroCount++;
		// IF ONE IS ENCOUNTERED THEN INCREMENT THE ONE COUNTER	
			if (arr[i] == 1)
				oneCount++;
		}
		
		for(int i = 0; i<zeroCount; i++) {
			arr[i]= 0;
		}
		for(int i = zeroCount; i<(zeroCount+oneCount); i++) {
			arr[i]= 1;
		}
		// FOR 2 THE REMAINING SPACES IN THE ARRAY LEFT WILL BE TAKEN BY 2
		for(int i = (zeroCount+oneCount); i<arr.length; i++) {
			arr[i]= 2;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {0,2,1,2,0,1,0,2,1,1};
		
		sort(arr);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}