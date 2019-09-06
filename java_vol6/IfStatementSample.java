package java_vol6;


import java.util.ArrayList;

/**
 * Java入門コース分岐処理説明クラス.<br>
 * if文
 */
public class IfStatementSample {

	public static void main(String[] args) {
		
		// 配列に文字列を代入
		String[] array = new String[3];
		array[0] = "school";
		array[1] = "scoo";
		array[2] = "schoo";
		
		String schoo = "schoo";	// 検索する文字列
		
		System.out.println("★★★ if文で文字列を検索します ★★★");
		
		// if文で文字列を検索
		// equalsメソッドは文字列を比較して同じであればtrue、異なればfalseを返します
		if (schoo.equals(array[0])) {
			System.out.println("1番目の文字列が「schoo」です");
		}
		
		if (schoo.equals(array[1])) {
			System.out.println("2番目の文字列が「schoo」です");
		}
		
		if (schoo.equals(array[2])) {
			System.out.println("3番目の文字列が「schoo」です");
		}
		
		System.out.println("★★★ for文とif文を組み合わせて文字列を検索します ★★★");
		
		ArrayList<String> list = new ArrayList<String>();
		
		// for文と組み合わせて「schoo」という文字列を検索
		for(int i = 0; i < array.length; i++) {
			
			// 変数schooと配列の文字列をif文で比較
			if(schoo.equals(array[i])) {
				System.out.println((i+1) + "番目の文字列が「schoo」です");
			}
			
			// 次のサンプルプログラムのため、ArrayListに値を追加
			list.add(array[i]);
		}
		
		System.out.println("★★★ ArrayListとif文、else文で文字列を検索します ★★★");
		
		if(list.isEmpty()) {
			
			// isEmptyメソッドはArrayListの中身が空の場合trueとなります
			System.out.println("listの中身は空です");
			
		} else {
			
			// listの中に要素があれば検索を実行
			// 拡張for文を使用して「schoo」という文字列を検索
			int counter = 1;
			for(String str : list) {
				
				if("schoo".equals(str)) {
					// 文字列の比較結果がtrueの場合
					System.out.println(counter + "番目の文字列が「" + str + "」です");
				} else {
					// 文字列の比較結果がfalseの場合
					System.out.println(counter + "番目の文字列は「schoo」ではありません");
				}
				// counterを更新
				counter++;
			}
		}
	}
}