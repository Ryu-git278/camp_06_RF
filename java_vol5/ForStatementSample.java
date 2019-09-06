package java_vol5;

/**
 * Java入門コース繰り返し処理説明クラス.<br>
 * for文
 */
public class ForStatementSample {

	public static void main(String[] args) {
		
		// String配列に値を代入
		String[] array = new String[5];
		array[0] = "schoo";
		array[1] = " ";
		array[2] = "WEB";
		array[3] = "-";
		array[4] = "campus";
		
		System.out.println("★★★　配列の処理(1)：配列の内容を取得(要素数を指定)　★★★");
		
		String str = "";	// 配列から取得した文字列を結合するための変数

		for (int i = 0; i < 5; i++) {
			
			// for文を使用して配列arrayの文字列を結合
			str = str + array[i];
			// for文の処理状況を出力
			System.out.println("変数iの値は「" + i + "」です");
			System.out.println("変数strの値は「" + str + "」です");
		}
		// for文の処理終了後、結合した文字列を出力
		System.out.println("結合した文字列：" + str);
		
		
		System.out.println("★★★　配列の処理(2)：配列の内容を取得(要素数は配列のサイズから取得)　★★★");
		
		String str2 = "";	// 配列から取得した文字列を結合するための変数

		for (int i = 0; i < array.length; i++) {
			
			// for文を使用して配列arrayの文字列を結合
			str2 = str2 + array[i];
			// for文の処理状況を出力
			System.out.println("変数iの値は「" + i + "」です");
			System.out.println("変数strの値は「" + str2 + "」です");
		}
		// for文の処理終了後、結合した文字列を出力
		System.out.println("結合した文字列：" + str2);
	}
}