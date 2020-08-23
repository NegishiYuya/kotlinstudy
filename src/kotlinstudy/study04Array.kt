package kotlinstudy

/**
 * 配列に関してのサンプルコード.
 */
fun main() {
    /** 配列 */
    var array1 = arrayOf(1,2,3)

    /** intの配列 */
    var array2 = intArrayOf(1,2,3)

    /** String(Nullable)の配列  要素数3の配列のすべての要素にnullを設定 */
    var array3 : Array<String?> = arrayOfNulls(3)

    /** 要素数3の配列を作成し、配列のindexとなる数字0から2までに対して2をかけたものをセット */
    var array4 = Array(3, {i -> i * 2})

    // 配列はJava同様にindexを指定してアクセス
    println(array1[1])
}