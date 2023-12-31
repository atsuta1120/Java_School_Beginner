/*
問題文:スロットマシーンプログラムを作成してください。
       "ゾロ目で大当たり！チャンスは30回"と表示させる
       "begin と入力してください> " と入力すると、開始するようにする
       ランダムな3つの自然数を、"〇回目：xxx" というように表示させる
       大当たり(ゾロ目)"〇回目で大当たりです。おめでとうございます！" と表示させる
       30回のうちに大当たりが出なかった場合、"残念でした。終わります。" と表示させる
*/

import java.util.Random;
import java.util.Scanner;

public class ComprehensiveBeginner02_01 {
    public static void main(String[] args) {

        boolean kaishi = false;
        int zannen = 0;

        System.out.println("ゾロ目で大当たり！チャンスは30回");
        // beginと入力されるまで繰り返し.
        while (kaishi == false) {
            System.out.print("beginと入力してください>");
            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            // 入力値がbeginか判断.
            if (a.equals("begin")) {
                kaishi = true;
                sc.close();
            }
        }
        // 30回繰り返す.
        for (int i = 1; i <= 30; i++) {
            // ランダムな0～9の整数を変数に代入.
            int b = new Random().nextInt(10);
            int c = new Random().nextInt(10);
            int d = new Random().nextInt(10);

            // i回目の数字を表示.
            System.out.println(i + "回目:" + b + c + d);
            zannen++;
            // ぞろ目のとき.
            if (b == c && c == d) {
                System.out.println(i + "回目で大当たりです。おめでとうございます！");
                break;
            }
            // 1回もぞろ目が出なかったとき.
            if (zannen == 30) {
                System.out.println("残念でした。終わります");
            }
        }

    }
}
