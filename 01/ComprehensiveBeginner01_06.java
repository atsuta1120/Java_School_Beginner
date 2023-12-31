/*
問題文:1から100までの値を繰り返しで表示するが、3の倍数の時はfoo、5の倍数の時はbarと数字の代わりに表示するプログラムを作成してください。
       3と5の両方の倍数の時はfoobarと表示されるようにしてください。
*/

public class ComprehensiveBeginner01_06 {
    public static void main(String[] args) {
        String b;
        // 1～100まで繰り返し.
        for (int i = 1; i <= 100; i++) {

            // 3もしくは5の倍数かそれ以外で出力を分岐.

            // 15の倍数のとき.
            if (i % 3 == 0 && i % 5 == 0) {
                b = "foobar";
                System.out.println(b);

                // 3の倍数のとき.
            } else if (i % 3 == 0) {
                b = "foo";
                System.out.println(b);

                // 5の倍数のとき.
            } else if (i % 5 == 0) {
                b = "bar";
                System.out.println(b);

                // 3もしくは5の倍数でないとき.
            } else {
                System.out.println(i);
            }
        }
    }
}
