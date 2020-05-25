package lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda4 {

	static int a = 1;
	void test() {
		a++;
		main(null);
	}


	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");

		list.forEach(s -> System.out.println(s));

		list.forEach(System.out::println);


	}

}
