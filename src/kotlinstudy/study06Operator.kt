package kotlinstudy

/**
 * 演算子についてのサンプルコード
 */
fun main() {
    // 範囲演算子
    /** 始点..終点の形式で範囲を表す */
    val range = 1..10
    val min = 1
    val max = 10

    // 対象の値 in 範囲 で対象の値が範囲内かどうかを確かめる
    println(min - 1 in range)
    println(min in range)
    println(max in range)
    println(max + 1 in range)

    // kotlinには範囲を表すためのクラスがある
    println(range::class)
}