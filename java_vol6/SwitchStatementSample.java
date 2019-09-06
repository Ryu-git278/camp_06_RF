package java_vol6;

/**
 * Java入門コース分岐処理説明クラス.<br>
 * switch文
 */
public class SwitchStatementSample {

	public static void main(String[] args) {
		
		System.out.println("★★★ switch文（int型変数の判定）★★★");
		int i = 2;	// switch文判定用変数
		
		// 変数iの値で処理を分岐
		switch(i) {
			case 1 : System.out.println("変数iの値は「1」です");
					 break;
			case 2 : System.out.println("変数iの値は「2」です");
					 break;
			case 3 : System.out.println("変数iの値は「3」です");
					// 変数iの値が3の場合はわざとつぎのcaseも処理する
			default: System.out.println("defaultの処理です");
		}
		
		System.out.println("★★★ switch文（String型変数の判定）★★★");
		String str = "AAA";	// switch文判定用変数
		
		// 変数iの値で処理を分岐
		switch(str) {
			case "AAA"	: System.out.println("変数strの値は「AAA」です");
					 	  break;
			case "BBB"	: System.out.println("変数strの値は「BBB」です");
					 	  break;
			case "CCC"	: System.out.println("変数strの値は「CCC」です");
						  // 変数strの値がCCCの場合はわざとつぎのcaseも処理する
			default		: System.out.println("defaultの処理です");
		}
	}
}