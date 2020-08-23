package kotlinstudy

/**
 * 定数についてのサンプルコード.
 */
fun main(){
    /** 定数はvalを使って宣言 Int型の定数 */
    val intVal = 10
    // aには再代入不可能
    // a = 11

    /** 配列の定数 */
    val arrayVal = arrayOf(1,2,3)
    // arrayVal には再代入不可能
    // arrayVal = arrayOf(4,5,6)

    // ただし、配列の要素は変更可能
    arrayVal[0] = 0
    println(arrayVal[0])
}