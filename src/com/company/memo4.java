//動作テスト

package com.company;

import java.util.Scanner;
import com.company.Word;

public class memo4 {

        public static void main(String[] args) {

            System.out.println("文字入力 :");

            Scanner sc = new Scanner(System.in);
            String[] inputs = new String[10];

            String input = sc.nextLine(); //単語入力
            String[] words = input.split(" ");//スペース区切り

//todo:登録終了後、forループ、println()メソッドにて出力

            for(int i = 0;i < words.length; i++){
                System.out.println(words[i]);
//            words[i].getSelfIntroduction();
            }


//todo:データ格納用配列は要素数 10を確保する

//        String[] inputs = new String[10];
//        inputs[0] = new Word(inputs[0];
//        inputs[1] = new Word(inputs[1];

//todo:文字をよみとるループはwhile文を使う （for文は不可）

            Word[] text =
                    {
                            new Word(inputs[0],inputs[1]),
                    };



//"e"入力で終了(上の入力が死んでる)
//参考サイト：https://teratail.com/questions/13741

            String str = input;
            while(!"e".equals(str = sc.nextLine())){
            }

            System.out.println("入力終了です。");

        }
    }
