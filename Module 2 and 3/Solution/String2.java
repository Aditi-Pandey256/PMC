import java.util.Arrays;
import java.util.Scanner;
public class String2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the word:- ");
		Scanner str1 = new Scanner(System.in);
		String str=str1.nextLine();

		System.out.println("Enter the another word:- ");
		Scanner str2 = new Scanner(System.in);
		String str3=str2.nextLine();


		char c1[]= str.toCharArray();
		char c2[]= str3.toCharArray();

		if (c1.length != c2.length) {

			System.out.println("Not Anagram!!");
			System.exit(0);

		}
		Arrays.sort(c1);
		Arrays.sort(c2);

		for (int i = 0; i < c1.length; i++)
		{
			if (c1[i] != c2[i]) {
				System.out.println("Not Anagram");
				System.exit(0);
			}
		}

		System.out.println("Bingo it's Anagram");


	}

}


