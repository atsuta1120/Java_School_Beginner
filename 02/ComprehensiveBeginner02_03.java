/*問題文:以下の表示結果が表示されるよう、下記のクラスを使用してコーディングしてください。
         buyDrink() メソッドを持つ、Coffee クラスを使用する
         buyDrink() メソッドを持つ、Juice クラスを使用する
         バヤリース の オレンジ 味です。130 円になります。
         午後の紅茶 の レモンティー 味です。150 円になります。
         ボス の甘さは 控え目、 ミルク 無しです。 110 円になります。
         ジョージア の甘さは 甘め、ミルク 入りです。 120 円になります。
*/

// 飲み物がコーヒーのときの出力.
class Coffee {
    String name;
    String taste;
    String milk;
    String price;

    public void buyDrink() {
        System.out.println(name + "の甘さは" + taste + "、" + milk + "です。" + price + "円になります。");
    }
}

// 飲み物がジュースのときの出力.
class Juice {
    String name;
    String taste;
    String price;

    public void buyDrink() {
        System.out.println(name + "の" + taste + "味です。" + price + "円になります。");
    }
}

public class ComprehensiveBeginner02_03 {
    public static void main(String[] args) {

        Juice bayaris = new Juice();
        bayaris.name = "バヤリース";
        bayaris.taste = "オレンジ";
        bayaris.price = "130";
        bayaris.buyDrink();

        Juice tea = new Juice();
        tea.name = "午後の紅茶";
        tea.taste = "レモンティー";
        tea.price = "150";
        tea.buyDrink();

        Coffee boss = new Coffee();
        boss.name = "ボス";
        boss.taste = "控え目";
        boss.milk = "ミルク無し";
        boss.price = "110";
        boss.buyDrink();

        Coffee georgia = new Coffee();
        georgia.name = "ジョージア";
        georgia.taste = "甘め";
        georgia.milk = "ミルク入り";
        georgia.price = "120";
        georgia.buyDrink();

    }

}
