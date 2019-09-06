package java_vol5;

import java.util.ArrayList;

/**
 * 計算実行クラス.
 */
@SuppressWarnings("unused")
public class Calculator {
	
	// mainメソッド
	public static void main(String[] args) {
		
		InputProcessing ip	= new InputProcessing();	// キー入力クラス
		Calculation calc	= new Calculation();		// 計算処理クラス

		// キー入力を受け付け
		ArrayList<String> input = ip.keyInput();
		
		// 配列（リスト）を作成
		ArrayList<String> list = new ArrayList<String>();
		// キーを追加
		list = calc.addValues(list, "10", "+");
		// 追加したキーを確認
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		int tashizan = calc.tashizan(10, 40);	// 足し算結果
		int hikizan  = calc.hikizan(100, 25);	// 引き算結果
		int kakezan  = calc.kakezan(25, 67);	// 掛け算結果
		int warizan  = calc.warizan(50, 20);	// 割り算結果 ※0で割るとエラーになってしまうので注意！
		
		// 足し算の結果を表示
		System.out.println(tashizan);
		// 引き算の結果を表示
		System.out.println(hikizan);
		// 掛け算の結果を表示
		System.out.println(kakezan);
		// 割り算の結果を表示
		System.out.println(warizan);
	}
}