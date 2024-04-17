/*
問題文:整数値を3つ入力させ、それらの値が小さい順（等しくてもよい）に並んでいるか判定し、
      小さい順に並んでいる場合はOK、そうなっていない場合はNGと表示するプログラムを作成してください。
*/

import java.util.Scanner;

public class ComprehensiveBeginner01_02 {
    public static void main(String[] args) {

        int arr[] = new int[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("整数を3回入力してください");

        for (int i = 0; i < 3; i++) {
            // n回目を入力指定(n=1~3).
            System.out.print(i + 1 + "回目>");

            int num01 = sc.nextInt();
            arr[i] = num01;
        }
        sc.close();
        // 入力した数字の比較により出力を分岐.
        if (arr[2] >= arr[1] && arr[1] >= arr[0]) {

            // 小さい順(等しいも可)に並んでいればOKを出力.
            System.out.println("OK");

        } else {
            // それ以外はNGを出力.
            System.out.println("NG");
        }
    }
}
