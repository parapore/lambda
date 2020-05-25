package lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lambda1 {
	static void print(Consumer<String> c) {
		String s = "ラムダ";
		c.accept(s);
	};

	static void print2(Supplier<String> s) {
		String val = s.get();
		System.out.println(val);
	};



	public static void main(String[] args) {


		print2(() -> "ラムダ");
		print(s -> System.out.println(s));

		Consumer<String> func = (s) -> {System.out.println(s);};
		func.accept("ラムダ式");

		Consumer<String> func2 = s -> System.out.println(s);
		func.accept("ラムダ式省略");

	}

}
