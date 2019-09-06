package java_vol6;

import java.util.ArrayList;

/**
 * 計算実行クラス.
 */
public class Calculator {
	
	// mainメソッド
	public static void main(String[] args) {
		
		InputProcessing ip	= new InputProcessing();	// キー入力クラス
		Calculation calc	= new Calculation();		// 計算処理クラス
		
		// TODO:例外処理は次回実装
		// キー入力を受け付け ※入力キーを間違えるとエラーになるのでご注意ください！
		ArrayList<String> input = ip.keyInput();
		
		int result = 0;	// 計算結果
		String key = "";// 入力キー
		
		// 入力されたキーを順番に処理
		for(String in : input) {
			
			// キーが演算キーの場合は変数に代入
			switch (in) {
			case "+":
			case "-":
			case "*":
			case "/":
			case "=":
				key = in;
				break;
			
			// キーが数値キーの場合は計算処理
			default:
				// 演算キーに応じた計算を実行
				if(!"".equals(key)) {
					
					switch (key) {
					// 足し算
					case "+":
						result = calc.tashizan(result, Integer.parseInt(in));
						break;
					// 引き算
					case "-":
						result = calc.hikizan(result, Integer.parseInt(in));
						break;
					// 掛け算
					case "*":
						result = calc.kakezan(result, Integer.parseInt(in));
						break;
					// 割り算
					case "/":
						result = calc.warizan(result, Integer.parseInt(in));
						break;
					}
					
				} else {
					
					// 演算キーが押される前の値を代入
					result = Integer.parseInt(in);
				}
			}
		}
		
		// 計算結果を出力
		System.out.println("計算結果は「" + result + "」です");
			
//		// 配列（リスト）を作成
//		ArrayList<String> list = new ArrayList<String>();
//		// キーを追加
//		list = calc.addValues(list, "10", "+");
//		// 追加したキーを確認
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		
//		int tashizan = calc.tashizan(10, 40);	// 足し算結果
//		int hikizan  = calc.hikizan(100, 25);	// 引き算結果
//		int kakezan  = calc.kakezan(25, 67);	// 掛け算結果
//		int warizan  = calc.warizan(50, 20);	// 割り算結果 ※0で割るとエラーになってしまうので注意！
//		
//		// 足し算の結果を表示
//		System.out.println(tashizan);
//		// 引き算の結果を表示
//		System.out.println(hikizan);
//		// 掛け算の結果を表示
//		System.out.println(kakezan);
//		// 割り算の結果を表示
//		System.out.println(warizan);
	}
}