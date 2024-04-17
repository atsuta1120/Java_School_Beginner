/*
問題文:整数値を入力させ、その値が偶数ならばeven、奇数ならばoddと表示するプログラムを作成してください。
*/

import java.util.Scanner;

public class ComprehensiveBeginner01_01 {
    public static void main(String[] args) {
        System.out.println("整数を入力してください");

        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();

        // 入力された整数が奇数か偶数かにより出力を分岐.
        if (inputNum % 2 == 0) {
            // 偶数の場合evenを出力.
            System.out.print("even");
        } else {
            // 奇数の場合oddを出力.
            System.out.print("odd");
        }

        sc.close();
    }
}
