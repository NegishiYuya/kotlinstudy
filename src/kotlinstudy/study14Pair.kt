package kotlinstudy

/**
 * 複数の戻り値を返すためのPairに関するサンプルコード.
 */
fun main() {
    // 複数の戻り値を受け取る　「分解宣言」という
    val (average, sum) = getAverageAndSum(1, 2, 3, 4)
    println(average)
    println(sum)
    /* 使わない戻り値は"_"で指定。2つ目の変数は未使用という意味。"_" */
    val (otherAverage, _) = getAverageAndSum(5, 6, 7, 8)
    println(otherAverage)
}

/**
 * 引数で渡した数値の平均と合計の2値を算出して返す<br>
 * Pairクラスを使って2値を返す
 */
fun getAverageAndSum(vararg numbers: Int): Pair<Double, Int> {
    var count = 0.0
    var sum = 0
    for (number in numbers) {
        sum += number
        count++
    }
    return Pair(sum / count, sum)
}