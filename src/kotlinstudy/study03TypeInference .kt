package kotlinstudy

/**
 * 型推論についてのサンプルコード.
 */
fun main() {
    // 下記のコードは型推論によってDouble型とみなされて、エラーとなる
    // var a : Float = 1.2
    // Float型であることを明示する必要がある
    var floatSample : Float = 1.2F

    // 下記のコードも型推論によってInt型とみなされて、エラーとなる
    // var b: Double = 10
    var doubleSample: Double = 10.0

    var intSample : Int = 10
    // IntをLongに変換する
    var longSample : Long = intSample.toLong()
}