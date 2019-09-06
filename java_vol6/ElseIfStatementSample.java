package java_vol6;

/**
 * Java入門コース分岐処理説明クラス.<br>
 * else-if文
 */
public class ElseIfStatementSample {

	public static void main(String[] args) {
		
		int i = 10;	// 条件式に用いる変数
		
		// 変数iの数値によって処理を分岐
		if(i < 10) {
			// 変数iが10未満の場合
			System.out.println("変数iの値は10未満です");
		} else if(i < 20) {
			// 変数iが10以上、20未満の場合
			System.out.println("変数iの値は10以上20未満です");
		} else {
			// 変数iが20以上の場合
			System.out.println("変数iの値は20以上です");
		}
	}
}