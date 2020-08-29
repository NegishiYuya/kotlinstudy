package kotlinstudy

/**
 * when式のサンプルコード.
 */
fun main() {
    val num = 1
    when (num) {
        1 -> println("numは1です")
        // ブロックを使うと複数行の処理を書くことができる
        2 -> {
            println("numは2です")
            println("そのため複数行、出力します")
        }
        // どの条件も満たさなかった時の処理
        else -> println("それ以外")
    }

    val score = 59
    // whenもif同様に式として利用することができる
    val message = when (score) {
        100, 99 -> "素晴らしい"
        // 60～90の範囲内の場合
        in 60..98 -> "合格"
        // 60～100の範囲にない場合
        !in 60..100 -> "不合格"
        // 上記条件以外の場合
        else -> "不正な点数です"
    }
    println(message)

    val obj: Any = "あいうえお"
    when (obj) {
        /**
         * is演算子で型をチェックすることができる<br>
         * 変数objはAny型ではあるが、is演算子で型チェックを行ったので<br>
         * String型として扱えるようになった("スマートキャスト"という)<br>
         *     よって、String型のプロパティのlengthにアクセスできている
         */
        is String -> println("文字数は${obj.length}です")
        else -> println("String型ではない型です")
    }

    val a = 10
    // when式は引数を使わず、if文の代替としても使える
    when {
        a <= 5 -> println("aは5以下です")
        a <= 10 -> println("aは10以下です")
        else -> println("aはそれ以外の値です")
    }
}