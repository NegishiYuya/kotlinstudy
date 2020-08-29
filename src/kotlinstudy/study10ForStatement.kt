package kotlinstudy

/**
 * for文のサンプルコード.
 */
fun main() {
    // 配列
    val arr = arrayOf(1, 2, 3)
    println("===配列に対するfor文===")
    for (item in arr) {
        println(item)
    }

    // Map
    val map = mapOf("First" to 1, "Second" to 2, "Third" to 3)
    println("===Mapに対するfor文===")
    for ((key, value) in map) {
        println("$key, $value")
    }

    // Listや配列にはwithIndexメソッドを使って順序を使うことができるようになる
    val list = listOf("文字1個目", "文字2個目", "文字3個目")
    println("===withIndexを使ったfor文===")
    for ((index, value) in list.withIndex()) {
        println("$index : $value")
    }

    // 範囲演算子との組み合わせ
    println("===範囲演算子と組み合わせ===")
    for (i in 1..3) {
        println("$i")
    }

    // untilを使って範囲の終端を含めないようにする
    println("===untilを使った範囲指定の仕方===")
    for (j in 1 until 3) {
        println("$j")
    }

    // downToでデクリメントさせる
    println("===downToでデクリメントさせる===")
    for (i in 3 downTo 1) {
        println("$i")
    }

    // stepを使って増分や減分を指定できる
    println("===stepを使って増分や減分を指定できる その1===")
    for (i in 1..10 step 3) {
        println("$i")
    }
    println("===stepを使って増分や減分を指定できる その2===")
    for (i in 10 downTo 1 step 3) {
        println("$i")
    }

    // ループを中断するにはbreak
    println("===ループを中断するにはbreak===")
    for (i in 1..10) {
        if (i == 8) break
        println("$i")
    }

    // 周回をスキップするにはcontinue
    println("===ループを中断するにはbreak===")
    for (i in 1..10) {
        if (i % 3 == 0) continue
        println("$i")
    }

    // break,continueは現在のループと周回を脱出する
    println("===break,continueは現在のループと周回を脱出する===")
    for (i in 1..3) {
        for (j in 1..3) {
            if (i * j > 5) break // このループを抜ける
            print("${i * j} ")
        }
        println()
    }

    // ラベル構文を用いて、外側のループを終了させる
    println("===ラベル構文を用いて、外側のループを終了させる===")
    // for文の前にラベル名@　をつける
    outer@ for (i in 1..3) {
        for (j in 1..3) {
            // @ラベル名を指定して外側のループを終了する
            if (i * j > 5) break@outer
            print("${i * j} ")
        }
        println()
    }

    println("\r\n===ラベル名は任意===")
    labelName@ for (i in 1..3) {
        for (j in 1..3) {
            if (i * j > 5) break@labelName
            print("${i * j} ")
        }
        println()
    }

}