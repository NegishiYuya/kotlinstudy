package kotlinstudy

/**
 * 可変長引数に関するサンプルコード.
 */
fun main() {
    /**
     * 可変長引数を使いたい場合は、仮引数にvarargを使う.
     */
    fun allSum(vararg values: Int): Int {
        var result = 0
        for (value in values) {
            result += value
        }
        return result
    }
    println(allSum(1, 2, 3, 4))

    val intArray = intArrayOf(5, 6, 7, 8)
    // 配列を可変長引数に渡したい場合はスプレッド演算子* を使う 可変長引数の一部として配列が使える
    println(allSum(1, 2, 3, 4, *intArray, 9))
}