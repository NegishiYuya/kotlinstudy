package kotlinstudy

/**
 * クラスに関するサンプルコード.
 */
class Member {
    // プロパティ
    var name: String = "デフォルトの名前"
    var age: Int = 20
        // 独自のSetter
        // fieldはバッキングフィールドと呼ばれるもので、メンバ変数の値を保持するもの
        // 詳細…https://kotlin.keicode.com/lang/classes-properties.php
        set(value) {
            if (value < 0) {
                println("不正な年齢です")
            }
            field = value
        }
    var depatmentName: String = "部署名"
        // 独自のGetter
        // fieldはバッキングフィールド
        get() {
            return field + "部"
        }

    // メソッド
    fun intro() {
        println("名前は $name  年齢は $age  部署は $depatmentName です")
    }
}