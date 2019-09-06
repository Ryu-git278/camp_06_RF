//int での入力終了テスト

package com.company;

import java.util.Scanner;

public class memo2 {

    public static void main(String args[]) {

        System.out.print("整数値を入力してください（0で終了）: ");

        Scanner scan = new Scanner(System.in);

        int inputValue = scan.nextInt();

        // inputValue が 0 でなければループ
        while (inputValue != 0) {

            System.out.println("入力された値は" + inputValue + "でした");

            System.out.print("再び整数値を入力してください（0で終了）: ");
            inputValue = scan.nextInt();
        }

        scan.close();

        System.out.println("終了します");
    }
}