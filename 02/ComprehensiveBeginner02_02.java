/*問題文:ジャンケンプログラムを作成してください。
         "ジャンケン"と表示させる
         "0:グー 1:チョキ 2: パー ＞数字を入力してください" 左記の数字が入力された場合、後続の処理に進み、
         それ以外の数字が入力された場合、エラーとして説明した後に 1.  に戻るようにする
         今までに作成してきたジャンケンプログラムを参考に、ジャンケン処理を実装する
*/

import java.util.Random;
import java.util.Scanner;

public class ComprehensiveBeginner02_02 {
    public static void main(String[] args) {
        int satoshi = 0;
        boolean flag = false;

        // 0,1,2のどれかが入力されるまで繰り返し.
        while (flag == false) {
            System.out.println("ジャンケン");
            System.out.println("0:グー 1:チョキ 2:パー >数字を入力してください");
            Scanner num01 = new Scanner(System.in);
            satoshi = num01.nextInt();

            // 入力が0,1,2であるか判断.
            if (satoshi == 0 || satoshi == 1 || satoshi == 2) {
                flag = true;
                num01.close();
            } else {
                System.out.println("errorです");
            }
        }

        int enemy = new Random().nextInt(3);
        String a = janken(satoshi, enemy);
        System.out.println(a);

    }

    // ルール:2は1に強い、1は0に強い、0は2に強い、同じ数はあいこ.
    // 以下、勝ち負け判断処理.
    private static String janken(int satoshi, int enemy) {
        if (satoshi == 2) {
            if (enemy == 2) {
                return "あいこです";
            } else if (enemy == 1) {
                return "勝ちました";
            } else if (enemy == 0) {
                return "負けました";
            }
        } else if (satoshi == 1) {
            if (enemy == 2) {
                return "負けました";
            } else if (enemy == 1) {
                return "あいこです";
            } else if (enemy == 0) {
                return "勝ちました";
            }
        } else if (satoshi == 0) {
            if (enemy == 2) {
                return "勝ちました";
            } else if (enemy == 1) {
                return "負けました";
            } else if (enemy == 0) {
                return "あいこです";
            }
        }
        return "";
    }
}