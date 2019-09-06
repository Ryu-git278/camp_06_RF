package java_vol6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 入力処理クラス.
 */
public class InputProcessing {

	/**
	 * キーボードの入力受付処理.
	 * @return 入力されたキー入力値
	 */
	public ArrayList<String> keyInput() {
	
		// キーボード入力の受け付け準備
		InputStreamReader	in	= new InputStreamReader(System.in);
		BufferedReader		br	= new BufferedReader(in);
		ArrayList<String> list  = new ArrayList<String>();
		
		String key	= "";	// キーボード入力受け付け
		int mode	= 1;	// 1：数値キー受け付け中、2：演算キー受け付け中
		boolean flg = false;
		
		// キーボード入力の受け付け
		while(true) {
			
			try {
				// 入力モードを判定
				if(mode == 1) {
					
					System.out.println("数字を入力してください");
					// キーボード入力を受け付け
					key = br.readLine();
					System.out.println("入力された数字は「" + key + "」です");
					
					// モード切り替え
					mode = 2;
					
				} else if(mode == 2) {
					
					System.out.println("演算キーを入力してください");
					// キーボード入力を受け付け
					key = br.readLine();
					System.out.println("入力された演算キーは「" + key + "」です");
					
					// 入力されたキーが「=」であるかをチェック
					flg  = checkKey(key);
					// モード切り替え
					mode = 1;
				}
				
				// 入力されたキーをlistに追加
				list.add(key);
				
				// 「=」が押された場合はwhile文を抜ける
				if(flg) {
					break;
				}
			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// listを返却
		return list;
	}
	
	/**
	 * 入力されたキーを判定します.<br>
	 * 入力されたキーが「=」の場合はtrue、それ以外はfalseを返します.
	 * @param key	入力されたキー
	 * @return		判定結果
	 */
	private boolean checkKey(String key) {
		
		boolean checkFlg = false;
		
		switch(key) {
		// 演算キーが「＝」の場合はtrueを設定
		case "=":
			checkFlg = true;
			break;
		// 演算キーが「+、-、*、/」の場合はなにもしない
		case "+":
		case "-":
		case "*":
		case "/":
			break;
		// 上記以外のキーの場合はメッセージを出力して
		default :
			System.out.println("演算キーは+、-、*、/、=のいずれかを入力してください。");
		}
		
		return checkFlg;
	}
}