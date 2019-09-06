package com.company;

public class Word {

// word(String)、meaning(String)
//    フィールド = オブジェクトの持つデータ
    public String word;
    public String meaning;

//    コンストラクタ = オブジェクトの実態化のさせ方
    public Word(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }


// メソッド = オブジェクトの持つ振る舞い
    public void getSelfIntroduction() {
        System.out.println("英語" + this.word + "日本語" + this.meaning + "を登録しました。" );
    }
}
