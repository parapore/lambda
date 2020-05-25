package lambda;
import java.util.function.Consumer;


// implementsは必要ないimportだけでOK
// なぜなら抽象メソッドacceptを疑似的に実装している感じ。
public class Lambda {
	static String val = "Hello";



	public static void main(String[] args) {
		/* 関数型インターフェース　Consumerをラムダ式で使う例。
		 * まずConsumer型変数 funcを宣言。
		 * funcにラムダ式でprintlnメソッドを代入。
		 * Consumerインターフェースのメソッドacceptを呼び出して実行。
		 * acceptは引数を受け取るだけで何もしない何も返さない抽象メソッド↓↓
		 * void accept(T t);
		 * ↑この引数にラムダ式がまるごと入る。
		 */
		Consumer<String> func = (String val) -> System.out.println(val);
		func.accept(val);
		func.accept("Hi!");





		// 同じリテラルでStringつくると同じ参照になる
		// メモリを節約する仕組み。定数プールとかコンスタントプールとか言うらしい。
		String a = "abc";
		String b = "abc";
		System.out.println(a == b);// true!!!

	}

}
