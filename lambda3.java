package lambda;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class lambda3 {
	static void print(Consumer<String> c) {
		c.accept("匿名");
	};

	static void print2(Supplier<String> s) {
		String val = s.get();
		System.out.println(val);
	}

	public static void main(String[] args) {

		print2(new Supplier<String>() {
			@Override
			public String get() {
				 return "匿名クラス";
			}
		});

		print(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});

		Consumer<String> func = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		};

		func.accept("匿名クラス");
	}
}
