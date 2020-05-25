package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Methodrefer {
	
	void test(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		String s = "Q";
		Methodrefer m = new Methodrefer();
		Consumer<String> cs = m::test;
		cs.accept(s);
		

		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");

		// System.outまでがクラス名
		list.forEach(System.out::println);
	}
}
