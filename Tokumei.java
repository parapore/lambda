package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Tokumei {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");

		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});
	}
}
