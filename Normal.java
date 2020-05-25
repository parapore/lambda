package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Normal implements Consumer<String>, Function<Integer, String>, Predicate<String>, Supplier<String> {
	@Override
	public void accept(String s) {
		System.out.println(s);
	}

	public String apply(Integer s) {
		return String.valueOf(s);
	}

	public boolean test(String s) {
		return s.equals(s);
	}

	public String get() {
		return null;
	}

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");

		// listの中身を取り出す処理。
		Normal n = new Normal();
		list.forEach(n);// forEachの引数にConsumer<String>型を渡す


		int a = 10;
		int b = 10;
		a = a++  + b;
		System.out.println(a);

		int c = 10;
		c = c++ + c + ++c - --c;
		System.out.println(c);

	}

}
