package kotlinstudy

/**
 * 関数と引数に関するサンプルコード.
 */
fun main() {
    /**
     * 関数の中に関数を定義することもできる(ローカル関数)<br>
     * 呼び出し箇所の前に定義が必要
     * 戻り値のない場合は戻り値のところにUnitと記載(省略可)
     */
    fun sayHello(name: String): Unit {
        println("Hello, $name")
    }

    fun sayHelloWithoutUnit(name: String) {
        println("Hello2, $name")
    }

    println(getTriangleArea(1.0, 2.0))
    println(getTriangleAreaSimple(1.0, 2.0))
    // 名前付き引数を使った関数を呼び出し
    println(getTriangleAreaWithDefaultArgsValue(height = 3.0, width = 2.0))
    // 第2引数のheightのみ指定する. 第1引数のwidthにはデフォルトの値が設定される
    println(getTriangleAreaWithDefaultArgsValue(height = 3.0))
    // 第1引数のwidthのみ指定する. 第2引数のheightにはデフォルトの値が設定される
    println(getTriangleAreaWithDefaultArgsValue(2.0))
    println(getSquareArea(2.0))
    sayHello("太郎")
    sayHelloWithoutUnit("太郎")
}

/**
 * 関数は 関数名(仮引数名: 仮引数の型,仮引数名: 仮引数の型…): 戻り値の型
 * で表現
 */
fun getTriangleArea(width: Double, height: Double): Double {
    return width * height / 2
}

/**
 * 戻り値が単一の式の結果を返す関数の場合、<br>
 * 下記のように中括弧やreturnを省略可<br>
 * 戻り値が推論できる場合は戻り値の定義を省略可
 */
fun getTriangleAreaSimple(width: Double, height: Double) = width * height / 2

/**
 * 関数は 関数名(仮引数名: 仮引数の型,仮引数名: 仮引数の型…): 戻り値の型
 * で表現
 */
fun getTriangleAreaWithDefaultArgsValue(width: Double = 1.0, height: Double = 1.5): Double {
    return width * height / 2
}

/**
 * 必須の引数と任意の引数がある場合、必須⇒任意の順に定義
 */
fun getSquareArea(width: Double, height: Double = 1.0): Double {
    return width * height
}