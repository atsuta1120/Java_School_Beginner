/* 
問題文:九九の表を、2重の繰り返し(2重for文)を使って表示するプログラムを作成してください。
      2重の繰り返しを使わず単に表示するのは NG
*/

public class ComprehensiveBeginner01_05 {
    public static void main(String[] args) {
        // １～9段まで繰り返す.
        for (int i = 1; i < 10; i++) {

            for (int j = 1; j < 10; j++) {
                // 計算.
                int a = i * j;
                // 表の体裁を整える.

                // 1桁かつ2列目以降の場合は" "を付加.
                if (a < 10 && j > 1) {
                    System.out.print(" ");
                }
                // 1～9行目は","を付加.
                if (j == 9) {
                    System.out.println(a);
                } else {
                    System.out.print(a + ",");

                }
            }
        }
    }

}
