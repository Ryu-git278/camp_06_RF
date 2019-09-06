package java_vol7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Java入門コース例外処理説明クラス.<br>
 */
public class ExceptionSample {

	public static void main(String[] args) {

		ExceptionSample sample = new ExceptionSample();
		
		try {
			
			// 呼び出し先で発生した例外を処理
			sample.throwSample();
			// 例外が発生するためここの処理は実行されません
			System.out.println("★★★ ここは実行されません ★★★");
			
		} catch(FileNotFoundException e) {
			
			// StackTraceを出力
			e.printStackTrace();
			System.out.println("★★★ 呼び出し先メソッドで例外が発生しました！ ★★★");
			
		} finally {
			
			// finally処理は必ず実行
			System.out.println("★★★ finallyブロックの処理です ★★★");
		}
		
		// 呼び出し先で例外を処理
		sample.tryCatchSample();
	}
	
	/**
	 * 存在しないファイルを読み込む処理を行い例外をスローします.
	 * @throws FileNotFoundException
	 */
	public void throwSample() throws FileNotFoundException {
		
		// 存在しないファイルを読みこませる処理
		String filePath = "";
		File dummyFile = new File(filePath);
		FileReader fr  = new FileReader(dummyFile);	// ここで例外発生
	}
	
	/**
	 * 存在しないファイルを読み込む処理を行い例外を発生させます.
	 */
	public void tryCatchSample() {
		
		try {
			
			// 存在しないファイルを読みこませる処理
			String filePath = "";
			File dummyFile = new File(filePath);
			FileReader fr  = new FileReader(dummyFile);	// ここで例外発生
			
		} catch(FileNotFoundException e) {
			
			// StackTraceを出力
			e.printStackTrace();
			System.out.println("★★★ 呼び出し先メソッドで例外を処理しました！ ★★★");
		}
	}
}