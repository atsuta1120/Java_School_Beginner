
/*
問題文:2次方程式 ax^2 + bx + c = 0 （x^2はxの2乗の意味）の係数a, b, cを入力し、
      2次方程式の解が2つの実数解か、重解か、2つの虚数解かを判別するプログラムを作成してください。
*/
import java.util.Scanner;

public class ComprehensiveBeginner01_03 {
    public static void main(String[] args) {
        int d;
        Scanner num01 = new Scanner(System.in);
        System.out.println("ax^2 + bx + c = 0");

        // 二次方程式の係数を指定.
        System.out.println("係数aを入力してください");
        int a = num01.nextInt();

        System.out.println("係数bを入力してください");
        int b = num01.nextInt();

        System.out.println("係数cを入力してください");
        int c = num01.nextInt();

        num01.close();

        // 平方根内の計算.
        d = b * b - (4 * a * c);

        // 平方根内の計算結果により分岐.
        if (d == 0) {
            System.out.println("この二次方程式の解は重解です");
        } else if (d < 0) {
            System.out.println("この二次方程式の解は虚数解です");
        } else {
            System.out.println("この二次方程式の解は実数解です");

        }

    }

}
