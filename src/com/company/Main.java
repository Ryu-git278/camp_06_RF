//授業内ヒントを復元

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("文字入力 :");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        System.out.println(inputs[0]);
        System.out.println(inputs[1]);



    }
}
