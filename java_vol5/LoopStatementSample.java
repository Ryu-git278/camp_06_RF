package java_vol5;

/**
 * Java入門コース繰り返し処理説明クラス.<br>
 * break文、continue文、多重ループ
 */
public class LoopStatementSample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// ★★★ break文サンプル ここから ★★★
		// while(true)は無限ループ
		while(true) {
			System.out.println("★★★ while文の処理 ★★★");
			// break文で無限ループを終了
			break;
		}
		// ★★★ break文サンプル ここまで ★★★
		
		
		// ★★★ continue文サンプル ここから ★★★
		for(int i = 0; i < 10; i++) {
			
			System.out.println("★★★ for文の処理 " + (i+1) +"回目 ★★★");
			
			// continue文でfor文の先頭に戻る
			if(true) {
				continue;
			}
			// この処理は実行されません
			System.out.println("★★★ この処理は実行されません ★★★");
		}
		// ★★★ continue文サンプル ここまで ★★★
		
		
		// ★★★ 多重ループサンプル ここから ★★★
		// 2重配列の作成
		String[][] array1 = new String[2][];
		array1[0] = new String[2];
		array1[1] = new String[2];
		
		// 1つ目の配列に値を代入
		array1[0][0] = "schoo ";
		array1[0][1] = "WEB-campus ";
		// 2つ目の配列に値を代入
		array1[1][0] = "Java入門コース ";
		array1[1][1] = "開講中！！";
		
		String str   = "";
		
		// 配列の処理
		for(int i = 0; i < array1.length; i++) {
			
			// 配列を取得
			String[] array2 = array1[i];
			
			for(int j = 0; j < array2.length; j++) {
				
				// 配列の中の文字列を取得して結合
				str = str + array2[j];
			}
		}
		
		// 結合した文字列を出力
		System.out.println(str);
		// ★★★ 多重ループサンプル ここまで ★★★
	}
}