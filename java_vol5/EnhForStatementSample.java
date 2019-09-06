package java_vol5;

import java.util.ArrayList;

/**
 * Java入門コース繰り返し処理説明クラス.<br>
 * 拡張for文
 */
public class EnhForStatementSample {

	public static void main(String[] args) {
		
		// String配列に値を代入
		String[] array = new String[4];
		array[0] = "schoo ";
		array[1] = "WEB";
		array[2] = "-";
		array[3] = "campus";
		
		System.out.println("★★★　拡張for文の処理(1)：配列の要素を順番に取得　★★★");
		
		String str1 = "";
		ArrayList<String> list = new ArrayList<String>();
		
		// 拡張for文で配列の内容を順番に処理
		for(String element1 : array) {
			
			// 文字列を結合
			str1 = str1 + element1;
			// 処理状況を出力
			System.out.println("変数str1の値は「" + str1 + "」です");
			
			// つぎの処理用に要素を追加
			list.add(element1);
		}

		System.out.println("★★★　拡張for文の処理(2)：コレクション（リスト）の要素を順番に取得　★★★");
	
		String str2 = "";
		
		// 拡張for文でリストの内容を順番に処理
		for(String element2 : list) {
			
			// 文字列を結合
			str2 = str2 + element2;
			// 処理状況を出力
			System.out.println("変数str2の値は「" + str2 + "」です");
		}
	}
}