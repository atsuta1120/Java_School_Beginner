/*
問題文:とある美術館の入場料金は、一人600円であるが、5人以上のグループなら一人550円、20人以上の団体なら一人500円である。
      人数を入力し、入場料の合計を計算するプログラムを作成してください。
 */
import java.util.Scanner;

class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {
        // 人数入力指示.
        System.out.print("人数を入力してください>");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = keisan(a);
        System.out.print("入場料は" + b + "円です");

        sc.close();
    }

    // 料金計算.
    public static int keisan(int a) {

        int ryoukin;
        // 以下、人数により、料金計算方法が分岐.

        // 人数が5人未満の場合.
        if (a < 5) {
            ryoukin = a * 600;
            return ryoukin;

            // 人数が20人未満の場合.
        } else if (a < 20) {
            ryoukin = a * 550;
            return ryoukin;

            // 人数が20人以上の場合.
        } else {
            ryoukin = a * 500;
            return ryoukin;
        }
    }
}
