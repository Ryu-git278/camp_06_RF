package com.company;

//スラッグに上がったほかの人の質問とその内容を見て…

import java.util.Scanner;
import com.company.Word;

public class Memo5 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int i = 0;
    Word word = new Word();
    String[][] strings = new String[5][2];

    while(i<5){
        String str = sc.nextLine();
        strings[i] = str.split("");
        i++;
    }

    for(int r =0; r < strings.length; r ++){
        Word.word = strings[r][0];
        Word.meaning = strings[r][1];
        System.out.println("英語" + Word.word + "日本語" + Word.meaning + "を登録しました。" );
    }

    }
}
