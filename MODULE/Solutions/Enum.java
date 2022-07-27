
enum Subjects {
	DBMS, DSA, NETWORKING, OPERATINGSYSTEM;
}

public class Enum {

	public static void main(String[] args) {

		// question (a)

		Subjects arr[] = Subjects.values();

		for (Subjects sub1 : arr) {

			System.out.println(sub1 + " at index " + sub1.ordinal());

			// question (c)

//			Subjects sub1 = sub1.CYBERSECURITY;
//			System.out.println(sub1);

		}

	}
}
