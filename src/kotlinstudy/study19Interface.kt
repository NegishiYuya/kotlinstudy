package kotlinstudy

/**
 * Interfaceに関するサンプルコード.
 */
fun main() {
    // 実装クラスの宣言
    val implement1 = Implement1()

    // Interfaceを実装したメソッドの呼び出し
    implement1.print()
    implement1.hoge()

    // Interface内の変数を使ったメソッドの呼び出し
    implement1.checkPrice()
    implement1.price = 500
    implement1.checkPrice()

    // 継承+実装を両方行っているクラスの宣言
    val implement2 = Implement2("太郎")
    implement2.hoge()
    implement2.intro()
}