package kotlinstudy

/**
 * クラスに関するサンプルコード.
 */
class Member {
    // プロパティ
    var name: String = "デフォルトの名前"
    var age: Int = 20
        // 独自のSetter
        set(value) {
            if (value < 0) {
                println("不正な年齢です")
            }
            field = value
        }
    var depatmentName: String = "部署名"
        // 独自のSetter
        get() {
            return field + "部"
        }

    // メソッド
    fun intro() {
        println("名前は $name  年齢は $age  部署は $depatmentName です")
    }
}