package kotlinstudy

/**
 * Nullable型についてのサンプル その2
 */
fun main() {
    var foo1 : String? = "hoge"
    println(foo1?.length)
    var foo2 : String? = null
    /**
     *     Javaだと下記のコードを実行すると、foo2がnullであることが原因で
     *     NullPointerExceptionが発生するが、kotlinではnullが返る
     */
    println(foo2?.length)
    // `?:` を使うことで、`foo2?.length`がnullだったときに返す値を定義できる
    println(foo2?.length ?: "nullです")
}