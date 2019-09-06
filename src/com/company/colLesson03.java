package com.company;

//    多分 try catch 文を組み入れるイメージ。01ができない！



public class colLesson03 {

    public static void main(String[] args) {

//問題2(colLesson02)の JAVA10組で
// "登録制限を超えました。登録済みデータは以下になります。"と表示

//続けて登録データ一覧を表示して終了

//【条件】if文ではなく例外処理を用いて終了する

//授業ぬるぽを復元

    String s = null;
    String s2 ="bb";
    try {
////        throwException();
        System.out.println(s.concat(s2));
        System.out.println("tryの中です");
    }catch (NullPointerException e){
        System.out.println("ぬるぽキャッチしました");
        e.printStackTrace();
    }

////    public static void throwException() throwS NullPointerException{
////        integer hoge = null;
////    hoge.intValue();
////        }

        System.out.println("処理が最後まで完了");
    }
}
