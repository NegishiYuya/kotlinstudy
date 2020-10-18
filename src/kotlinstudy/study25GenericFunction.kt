package kotlinstudy

/**
 * ジェネリック関数に関するサンプルコード.
 *
 * 参考)
 * https://dogwood008.github.io/kotlin-web-site-ja/docs/reference/generics.html
 */
fun main() {
    val intArray = arrayOf(1, 2, 3)
    println("最後の要素は${getLastItem<Int>(intArray)} 文字数は ${getLastItemLength<Int>(intArray)}")

    val stringArray = arrayOf("あ", "いえ", "うえお")
    println("最後の要素は${getLastItem<String>(stringArray)} 文字数は ${getLastItemLength<String>(stringArray)}")

    val stringArray2 = arrayOf("か", "き", "く")
    println("最後の要素は${getLastItem(stringArray2)} 文字数は ${getLastItemLength(stringArray2)}")
}

/**
 * ジェネリクスは関数にも応用できる
 */
fun <T> getLastItem(arr: Array<T>): T {
    return arr[arr.size - 1]
}

fun <T> getLastItemLength(arr: Array<T>): Int {
    return arr[arr.size - 1].toString().length
}