package java_vol7;

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
		String msg  = "";	// 再入力用メッセージ
		int mode	= 1;	// 1：数値キー受け付け中、2：演算キー受け付け中
		boolean flg = false;
		
		// キーボード入力の受け付け
		while(true) {
			
			try {
				// 入力モードを判定
				if(mode == 1) {
					
					// キーボード入力を受け付け
					System.out.println(msg + "数字を入力してください");
					key = br.readLine();
					System.out.println("入力された数字は「" + key + "」です");
					
					try {
						// 入力された数値をチェック
						checkValue(key);
					} catch(NumberFormatException ne) {
						msg = "入力値が整数ではないため再度";
						continue;
					}
					
					// モード切り替え
					mode = 2;
					// 再入力メッセージを初期化
					msg  = "";
					
				} else if(mode == 2) {
					
					System.out.println(msg + "演算キーを入力してください");
					// キーボード入力を受け付け
					key = br.readLine();
					System.out.println("入力された演算キーは「" + key + "」です");
					
					// 入力されたキーが「=」であるかをチェック
					flg  = checkKey(key);
					
					// キーが正しい値（+、-、*、/、=）であるかをチェック
					if(!checkValue(key, flg)) {
						msg = "入力値が正しくないため再度";
						continue;
					}
					
					// モード切り替え
					mode = 1;
					// 再入力メッセージを初期化
					msg  = "";
				}
				
				// 入力されたキーをlistに追加
				list.add(key);
				
				// 「=」が押された場合はwhile文を抜ける
				if(flg) {
					break;
				}
			
			} catch (IOException e) {
				// 入出力例外が発生した場合はプログラムを強制終了
				System.exit(0);
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
		// 上記以外のキーの場合はメッセージを出力
		default :
			System.out.println("演算キーは+、-、*、/、=のいずれかを入力してください。");
		}
		return checkFlg;
	}
	
	/**
	 * 入力値が整数値であるかをチェックします.<br>
	 * 整数値以外はNumberFormatExceptionをスローします.
	 * @param value チェック対象
	 * @return チェック結果
	 * @throws NumberFormatException
	 */
	private boolean checkValue(String value) throws NumberFormatException {
		
		// 変数valueをint型に変換
		// 変換できない場合は例外を投げる
		Integer.parseInt(value);
		
		// 変換できている場合はtrueを返却
		return true;
	}
	
	/**
	 * 入力値が正しい演算キー（+、-、*、/）であるかをチェックします.
	 * @param key 演算キー
	 * @param flg チェックフラグ
	 * @return チェック結果
	 */
	private boolean checkValue(String key, boolean flg) {
		
		boolean result = true;	// チェック結果
		
		// フラグチェック
		if(!flg) {
			
			// フラグがfalse（=以外）の場合はチェック実施
			switch(key) {
			// 演算キーが「+、-、*、/」の場合はなにもしない
			case "+":
			case "-":
			case "*":
			case "/":
				break;
			default :
				// 演算キーが上記以外の場合は結果をfalseに設定
				result = false;
			}
		}
		
		// チェック結果を返却
		return result;
	}
}