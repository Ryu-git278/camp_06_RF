package java_vol6;

import java.util.ArrayList;

/**
 * 計算処理クラス.
 */
public class Calculation {
	
	/**
	 * 入力されて値を配列に格納するメソッドです.<br>
	 * 少し特殊な仕様ですが、配列の中身はつぎの順番で格納されることを想定します.<br>
	 * 数値キー(0~9)、演算キー(+、-、*、/)、数値キー、演算キー・・・<br>
	 * @param list	値のリスト
	 * @param num	クリックされた数値キー
	 * @param key	クリックされた演算キー
	 * @return 値のリスト
	 */
	public ArrayList<String> addValues(ArrayList<String> list, String num, String key) {
		
		// listの中身が空でないことをチェック
		if(list == null) {
			// listの中身が空の場合はインスタンスを作成
			list = new ArrayList<String>();
		}
		
		// listに入力された値を追加
		list.add(num);
		list.add(key);
		
		// listを返却
		return list;
	}
	
	/**
	 * 足し算をするメソッドです.
	 */
	public int tashizan(int i1, int i2) {
		// 加算結果を返却
		return i1 + i2;
	}
	
	/**
	 * 引き算をするメソッドです.
	 */
	public int hikizan(int i1, int i2) {
		// 減算結果を返却
		return i1 - i2;
	}
	
	/**
	 * 掛け算をするメソッドです.
	 */
	public int kakezan(int i1, int i2) {
		// 乗算結果を返却
		return i1 * i2;
	}
	
	/**
	 * 割り算をするメソッドです.<br>
	 * 変数i2が0の場合はゼロ除算を回避するため強制的に0を返却します.
	 */
	public int warizan(int i1, int i2) {
		
		int result = 0;	// 返却値
		
		// 変数i2の値が0以外の場合は除算
		if(i2 != 0) {
			result = i1 / i2;
		}
		
		// 除算結果を返却
		return result;
	}
}
