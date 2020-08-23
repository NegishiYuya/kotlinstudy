package kotlinstudy

/**
 * Collectionについてのサンプルコード.
 */
fun main() {
    /** List */
    var list = listOf("あ","い","う","え")
    /** Set(重複を許さない、順序を指定してのアクセスができない) */
    var set = setOf("A","B","A","C")
    /** Map */
    var map = mapOf("first" to 1,"second" to 2)
    println("list: $list" )
    println("set: $set")
    println("map: $map")

    /** ListはlistOfで作成すると読み取り専用のため、
     * 要素の書き換えが想定される場合はmutableListOfメソッドを使って作成すること */
    var mutableList = mutableListOf("か","き","く")
    mutableList[1] = "さ"
    println("mutableList: $mutableList" )
    // 下記のコードはエラーとなる
    // list[1] = "さ"
}