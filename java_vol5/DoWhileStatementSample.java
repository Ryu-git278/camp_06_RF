package java_vol5;

/**
 * Java入門コース繰り返し処理説明クラス.<br>
 * do-while文
 */
public class DoWhileStatementSample {

	public static void main(String[] args) {
		
		// boolean配列の値を代入
		boolean[] array = new boolean[4];
		array[0] = false;
		array[1] = true;
		array[2] = false;
		array[3] = true;
		
		int counter = 0;	// 配列の要素取得用カウンタ
		boolean flg = true;	// while文の処理判定用フラグ
		
		// フラグの値が「false」になるまで処理を繰り返す
		do {
			
			/*
			 *  配列から要素を取得
			 *  配列の要素数はカウンタで指定
			 */
			flg = array[counter];
			
			System.out.println("カウンタの値は「" + counter + "」です");
			System.out.println("現在のフラグは「" + flg + "」です");
			
			// カウンタの値を追加
			counter++;
		} while(flg);
		
		do {
			
			System.out.println("★★★　do-while文（2回目）スタート　★★★");
		} while(flg);
	}
}