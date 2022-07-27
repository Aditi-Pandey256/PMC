import java.util.ArrayList;
import java.util.List;

public class generics {

	public static void print(List<? extends Number> list) {
		for (Number n : list)
			System.out.print(n + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		List<Number> list = new ArrayList<>();
		list.add(2);
		list.add(6.86);
		list.add(5064);

		generics.print(list);
	}

}
