package java_vol5;

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
		ArrayList<String> list = new ArrayList<String>();
		String str = "";
		
		// キーボード入力の受け付け
		// TODO:今回は1回キー入力を受付たらbreak文で繰り返し処理を抜けます
		while(true) {
			
			System.out.println("数字を入力してください");
	
			try {
				
				str = br.readLine();
				System.out.println("入力された数字は「" + str + "」です");
				
				// TODO:6限目で入力された値の処理を挿入します
			
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		}
		
		return list;
	}
}