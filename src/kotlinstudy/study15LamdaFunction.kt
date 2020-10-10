package kotlinstudy

/**
 * 高階関数とラムダ式に関するのサンプルコード.
 */
fun main() {
    val arr = arrayOf(1, 2, 3, 4)
    // forEachの引数に関数を渡す(引数として関数をとったり、関数を戻り値とする関数を高階関数という)
    println("===== forEachの引数に関数を渡す =====")
    arr.forEach(::dispNumber)
    println()

    // 上記のコードはラムダ式を使って書き換えができる
    println("===== ラムダ式で書き換えた結果 =====")
    arr.forEach({ number: Int -> print(number) })
    println()

    // ラムダ式の引数の型が推論できる場合は型を省略できる
    println("===== ラムダ式の引数の型を省略した結果 =====")
    arr.forEach({ number -> print(number) })
    println()

    // 高階関数の最後の引数がラムダ式だったら括弧を外側に出せる
    println("===== ラムダ式の括弧を外側にした結果 =====")
    arr.forEach() { number -> print(number) }
    println()

    // 高階関数の唯一の引数がラムダ式だったら括弧は省略可能
    println("===== ラムダ式の括弧を省略した結果 =====")
    arr.forEach { number -> print(number) }
    println()

    // ラムダ式の引数が1個であれば暗黙的な引数itで実装可能
    println("===== ラムダ式の引数を暗黙的な引数itにした結果 =====")
    arr.forEach { print(it) }
    println()

    // ラムダ式内のreturnはラベル構文を使う
    println("===== ラムダ式内でreturnを使いたい場合はラベル構文を使用 =====")
    arr.forEach {
        if (it == 3) return@forEach
        print(it)
    }
    println("3以外は出力")
    println()

    // 自分で定義した高階関数を呼び出すことも可能
    val time = benchmark("ミリ秒") {
        var x = 0
        for (i in 1..1_000_000_000) {
            x++
        }
    }
    println(time)
}

fun dispNumber(number: Int) {
    print(number)
}

/**
 * 第2引数の関数の処理時間を第1引数で渡す単位名を付与して文字列で返す.
 */
fun benchmark(unitText: String, func: () -> Unit): String {
    val start = System.currentTimeMillis()
    func()
    val end = System.currentTimeMillis()
    return (end - start).toString() + unitText;
}