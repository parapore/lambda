package lambda;
import java.util.function.Consumer;

public class Lambda2 implements Consumer<String> {

	/*関数型インターフェースComsumerをラムダ式使わないで使ってみる例
	 * implements Consumerして
	 * 抽象メソッドacceptをオーバーライドする。
	 */
	@Override
	public void accept(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {

		Lambda2 lam2 = new Lambda2();
		lam2.accept("普通のオーバーらーいど");
	}
}
