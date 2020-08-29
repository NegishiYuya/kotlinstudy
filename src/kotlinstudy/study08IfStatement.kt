package kotlinstudy

/**
 * if式に関するサンプルコード.
 */
fun main() {
    val a = 10
    // if文内に処理を実装可能
    if (a <= 5) {
        println("aは5以下です")
    } else if (a <= 10) {
        println("aは10以下です")
    } else {
        println("aは10より大きいです")
    }

    val b = 11
    // if式を使って値を返却することも可能
    val message = if (b <= 5) {
        "bは5以下です"
    } else if (b <= 10) {
        "bは10以下です"
    } else {
        // 複数行の場合は最後の行が式の評価結果として返却さえる
        "ここは無視される"
        "bは10より大きいです"
    }
    println(message)

    val c = 4
    // 上記のif式は省略した書き方を使うことも可能
    val messageForC = if (c <= 5) "cは5以下です" else if (c <= 10) "cは10以下です" else "cは10より大きいです"
    println(messageForC)
}